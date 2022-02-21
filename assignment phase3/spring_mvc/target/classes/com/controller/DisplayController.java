import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DisplayController {
@ResponseBody
@RequestMapping("display")
	public String display(HttpServletRequest request, HttpServletResponse response) {
		String userid = request.getParameter("userid");
		String username= request.getParameter("username");
		
		return userid + username;
	}
}
