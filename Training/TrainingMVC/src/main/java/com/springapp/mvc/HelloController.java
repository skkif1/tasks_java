package com.springapp.mvc;

import com.springapp.mvc.Enteties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;

@Controller
@SessionAttributes("user")
public class HelloController {


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView printWelcome( ) {
		return new ModelAndView("hello", "user", new User());
	}

	@RequestMapping(value = "/check-user", method = RequestMethod.POST)
	public ModelAndView prgCheck(@Valid @ModelAttribute("user") User user , BindingResult result)
	{
		ModelAndView modelAndView = new ModelAndView();
		if (!result.hasErrors()) {
			RedirectView view = new RedirectView("second");
			modelAndView.setView(view);
		}else {
			modelAndView.setViewName("hello");
		}
		return modelAndView;
	}

	@RequestMapping(value = "second")
	public String printSecond(){
		return "second";
	}

	@RequestMapping(value = "/third", method = RequestMethod.GET)
		public ModelAndView printThird(){
			return new ModelAndView("third");
		}

	@RequestMapping(value = "/rest", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public User getUser()
	{
		User user = new User();
		user.setName("Vasya");
		return user;
	}

	@RequestMapping(value = "/put", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<String> consumeUser(@RequestBody User user)
	{
		System.out.println(user.getName());
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}
}