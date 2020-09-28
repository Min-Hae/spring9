package aa.bb.xml;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class XmlController {
	@RequestMapping(value = "member_xml", method = RequestMethod.GET)
	public String formBack() {
		return "myform";
	}
	
	@RequestMapping(value = "member_xml", method = RequestMethod.POST)
	@ResponseBody
	public String submit(@RequestParam("name") String name,
			@RequestParam("age") String age) {
		return name + age;
		
	}
}
