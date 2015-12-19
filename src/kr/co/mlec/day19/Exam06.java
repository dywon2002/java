package kr.co.mlec.day19;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Exam06 {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			DocumentBuilder builder = factory.newDocumentBuilder();

			Document doc = builder.parse("src/kr/co/mlec/day19/daumBlog.xml");
			NodeList list = doc.getElementsByTagName("item");
			System.out.println("item 태그 수 : " + list.getLength());

			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);
				NodeList cList = node.getChildNodes();
				System.out.println("item 자식 수 : " + cList.getLength());

				for (int j = 0; j < cList.getLength(); j++) {
					Node cNode = cList.item(j);
					String name = cNode.getNodeName();
					if (name.equals("#text"))
						continue;
					String value = cNode.getTextContent();
					System.out.println("Node name : " + name + ", value : " + value);

				}

			}

		} catch (Exception e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}
}
