package mkr.inspections.Roads.Utilities.Inspection.controller;

import mkr.inspections.Roads.Utilities.Inspection.Domain.Role;
import mkr.inspections.Roads.Utilities.Inspection.Domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Controller
public class LoginController {

	private Logger logger = Logger.getLogger(getClass().getName());

	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage(HttpSession session) {
//		session.invalidate();
		return "Authentication/login";
		
	}

	@GetMapping("/showForgotPassword")
	public String showForgotPassword() {
		return "Authentication/forgotPassword";
	}

	@GetMapping("/showResetPassword")
	public String showResetPassword(HttpSession session, Model model) {
		Long UserId =  (Long)session.getAttribute("resetId");
		User existing =  (User)session.getAttribute("existing");
		List<Role> roles =  (List<Role>)session.getAttribute("Reset_roles");
		String formRole = "";
		if(UserId!=null){
			logger.info("===================================================================================");
			for(Role role:roles){
				formRole = role.getName();
			}
			logger.info("Form Role: " + formRole);
			existing.setFormRole(formRole);
			logger.info(existing.toString());
			model.addAttribute("existing", existing);
			model.addAttribute("resetId", UserId);
			logger.info("Session Resetting user : "+UserId);
		}else{
			logger.info("Session reset target user not found: ");
		}
		return "Authentication/ResetPassword";
	}

	@GetMapping("/showRegistrationForm")
	public String showMyLoginPage(Model theModel) {
		User user = new User();
		theModel.addAttribute("user", user);
		return "Authentication/registration-form";
	}
	
	// add request mapping for /access-denied
	
	@GetMapping("/access-denied")
	public String showAccessDenied() {
		
		return "Thymeleaf/access-denied";
		
	}

	@GetMapping("/Dashboard")
	public String Dashboard() {

		return "Thymeleaf/Dashboard";

	}

}









