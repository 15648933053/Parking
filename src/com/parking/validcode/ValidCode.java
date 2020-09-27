package com.parking.validcode;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.w3c.dom.css.RGBColor;

@WebServlet("/validcode")
public class ValidCode extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BufferedImage image = new BufferedImage(200, 100,BufferedImage.TYPE_INT_BGR);
		Graphics2D gra = image.createGraphics();
		gra.setColor(Color.white);
		gra.fillRect(0, 0, 200, 100);
		List<Integer> number = new ArrayList<Integer>();
		Random random = new Random();
		for(int i = 0; i < 4; i++) {
			number.add(random.nextInt(10));
		}
		gra.setFont(new Font("����",Font.ITALIC|Font.BOLD,40));
		Color[] color = {Color.black,Color.blue,Color.gray,Color.green,Color.red,Color.pink,Color.orange,Color.yellow,Color.magenta};
		for(int i = 0; i < 4; i++) {
			gra.setColor(color[random.nextInt(9)]);
			if(i != 0)
			gra.drawString(number.get(i)+"", (int)(i*45+Math.random()*20-10), (int)(70+Math.random()*30-15));
			else {
				gra.drawString(number.get(i)+"", (int)(i*45+Math.random()*10), (int)(70+Math.random()*30-15));
			}
		}
		for(int i = 0; i < 2; i++) {
			gra.setColor(color[random.nextInt(9)]);
			gra.drawLine((int)Math.random()*10, (int)(Math.random()*101), (int)Math.random()*11+190, (int)(Math.random()*101));
		}
		
		ServletOutputStream outputStream = resp.getOutputStream();
		ImageIO.write(image, "jpg",outputStream);
		String code="";
		HttpSession session = req.getSession();
		for(int i = 0; i < 4; i++) {
			code+=number.get(i);
		}
		session.setAttribute("number", code);
	}
}
