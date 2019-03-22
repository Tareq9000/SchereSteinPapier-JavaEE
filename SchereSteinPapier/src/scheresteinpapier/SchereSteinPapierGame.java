package scheresteinpapier;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SchereSteinPapierGame")
public class SchereSteinPapierGame extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SchereSteinPapierGame() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String zug = request.getParameter("button");
		System.out.println(request.getParameter("button"));

		HttpSession session = request.getSession();
		Spieler s=(Spieler)session.getAttribute("spieler");
		s.setLastanswer(zug);
		
		
		
		int zahl = Spieler.getAmzug() / 2;
		
		boolean spieler1 = false;
		boolean spieler2 = false;
	
		if(zahl + zahl == Spieler.getAmzug()) {
			Spieler.setAmzug(Spieler.getAmzug()+1);
			ServletContext context = request.getServletContext();
			ArrayList<Spieler> list = (ArrayList<Spieler>) context.getAttribute("spieler");
			String zug1 = list.get(0).getLastanswer();
			String zug2 = list.get(1).getLastanswer();
			
			if(zug1.equals(zug2)) {	
			}
			if(zug1=="schere" && zug2=="stein") {
				list.get(1).setScore(list.get(1).getScore()+1);
				spieler2 = true;
			}
			if(zug1=="schere" && zug2=="papier") {
				list.get(0).setScore(list.get(0).getScore()+1);
				spieler1 = true;
			}
			if(zug1=="stein" && zug2=="schere") {
				list.get(0).setScore(list.get(0).getScore()+1);
				spieler1 = true;
			}
			if(zug1=="stein" && zug2=="papier") {
				list.get(1).setScore(list.get(1).getScore()+1);
				spieler2 = true;
			}
			if(zug1=="papier" && zug2=="schere") {
				list.get(1).setScore(list.get(1).getScore()+1);
				spieler2 = true;
			}
			if(zug1=="papier" && zug2=="stein") {
				list.get(0).setScore(list.get(0).getScore()+1);
				spieler1 = true;
			}
			
			if(list.get(0).getScore() == 3) {
				
			}
			if(list.get(1).getScore() == 3) {
				
			}			
		}

		
		RequestDispatcher rd = request.getRequestDispatcher("SchereSteinPapierWait2.jsp");
		request.setAttribute("gewonnen1", spieler1);
		request.setAttribute("gewonnen2", spieler2);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
