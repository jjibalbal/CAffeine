package exe.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import exe.common.ActionForward;
import exe.common.Command;

public class MyFageCommand implements Command {

	@Override
	public ActionForward execute(HttpServletRequest request) throws IOException, ServletException {
		
		HttpSession session = request.getSession();
		
		ActionForward action = new ActionForward();
		
		action.setPath("WEB-INF/myFage.jsp");
		action.setSend(false);
		
		return action;
	}

}
