package kr.co.mlec.day19;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Exam07 {
	public static void main(String[] args) {
		try {
			String blogAddr = "https://apis.daum.net/search/blog"
					+ "?apikey=f1fe1ade01115b09c6f078e3f1d1e50b"
					+ "&q="+URLEncoder.encode("탕수육","UTF-8")
					+ "&output=xml";
			URL url = new URL(blogAddr);
			InputStream in = url.openStream();
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			DocumentBuilder builder = factory.newDocumentBuilder();

			Document doc = builder.parse(in);
			NodeList list = doc.getElementsByTagName("item");
			ArrayList<BlogVO> blogList = new ArrayList<>();
			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);
				NodeList cList = node.getChildNodes();
				
				BlogVO blog = new BlogVO();
				for (int j = 0; j < cList.getLength(); j++) {
					Node cNode = cList.item(j);
					String name = cNode.getNodeName();
					if (name.equals("#text"))
						continue;
					String value = cNode.getTextContent();
					switch(name)
					{
					case "title": blog.setTitle(value);
					break;
					case "description": blog.setDescription(value);
					break;
					case "link": blog.setLink(value);
					break;
					case "author": blog.setAuthor(value);
					break;
					case "comment": blog.setComment(value);
					break;
					case "pubDate": blog.setPubDate(value);
					break;
					}
					
				}
				blogList.add(blog);
			}
			System.out.println("다음 블로그");
			System.out.println("-------------------------");
			System.out.println("블로그명\t글제목\t링크주소\t작성일시");
			System.out.println("-------------------------");
			for(BlogVO blog : blogList){
				System.out.print(blog.getAuthor()+"\t"+blog.getTitle()+"\t"+blog.getLink()+"\t"+blog.getPubDate()+"\n");
			}
			System.out.println("-------------------------");

		} catch (Exception e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}
}
