package scheresteinpapier;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SchereSteinPapier")
public class SchereSteinPapier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SchereSteinPapier() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
		if(name != null) {
			Spieler spieler = new Spieler();
			spieler.setName(name);
			ServletContext context = request.getServletContext();
			ArrayList<Spieler> list = (ArrayList<Spieler>) context.getAttribute("spieler");
			
			if(list == null) {
				list = new ArrayList<Spieler>();
				context.setAttribute("spieler", list);
			}
			if(Spieler.getAnzSpieler() != 2) {
				list.add(spieler);
				Spieler.setAnzSpieler(Spieler.getAnzSpieler()+1);
				System.out.println(list.size());
				
				for(Spieler s : list) {
					System.out.println(s.getName());
				}
				
				HttpSession session = request.getSession();
				session.setAttribute("spieler", spieler);
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("SchereSteinPapierWait.jsp");
		rd.forward(request, response);
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
