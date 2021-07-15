package du.user.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import du.dept.domain.DeptVO;
import du.dept.service.DeptService;
import du.user.domain.UserVO;
import du.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/signUpPage.do")
	public ModelAndView signUpPage() {
		ModelAndView mav = new ModelAndView("user/signUp.jsp");
		List<DeptVO> dept = deptService.selectDeptList();
		mav.addObject("dept", dept);
		
		return mav;
	}
	
	@RequestMapping("/signUp.do")
	public String signUp(UserVO user) {
		userService.insertUser(user);
		return "redirect:/loginPage.do";
	}
	
	@RequestMapping("/userModify.do")
	public String userModify(UserVO user) {
		System.out.println("========");
		System.out.println(user.getName());
		System.out.println(user.getUserId());
		
		userService.updateUser(user);
		return "redirect:/logout.do";
	}
	
	@RequestMapping("/userDelete.do")
	public String userDelete(String userId) {
		userService.deleteUser(userId);
		return "redirect:/loginPage.do";
	}
	
	@RequestMapping("/userCheck.do")
	public String userCheck(String userId) {
		return "redirect:/userInfo.jsp";
	}
	
}
