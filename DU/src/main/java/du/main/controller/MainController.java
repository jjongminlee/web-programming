package du.main.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import du.dept.domain.DeptVO;
import du.dept.service.DeptService;
import du.user.domain.UserVO;
import du.user.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping(value="/login.do", method = RequestMethod.POST)
	public String mainPage(HttpServletRequest request, @ModelAttribute UserVO user) {
		if(userService.loginProcess(request, user)){
			return "main.jsp";
		} else {
			return "login.jsp";
		}
	}
	
	@RequestMapping("/loginPage.do")
	public String loginPage() {
		return "login.jsp";
	}
	
	@RequestMapping("/userInfo.do")
	public ModelAndView userInfo() {
		ModelAndView mav = new ModelAndView("user/userInfo.jsp");
		List<DeptVO> dept = deptService.selectDeptList();
		mav.addObject("dept", dept);
		return mav;
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.removeAttribute("USER");
		return "login.jsp";
	}
	
	@RequestMapping("/mainPage.do")
	public String mainPage(HttpSession session) {
		if(session.getAttribute("USER") == null) {
			return "redirect:/loginPage.do";  //세션이 없으면 로그인 페이지로 이동
		}
		
		return "main.jsp";
	}
}
