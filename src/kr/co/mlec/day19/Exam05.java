package kr.co.mlec.day19;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Exam05 {
	public static void main(String[] args) {
		// Dom parser를 활용하기 위한 단계
		// 1. DocumentBuilderFactory 객체를 얻는다
		// 2. factory 객체를 이용해서 DocumentBuilder 객체를 얻는다
		// 3. parser를 통해서 xml 파싱을 진행

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			// DOM 파서
			DocumentBuilder builder = factory.newDocumentBuilder();

			// xml 파싱
			// 파싱된 Document 객체는 family.xml 파일의 정보를 담고 있다
			Document doc = builder.parse("src/kr/co/mlec/day19/family.xml");
			// 파싱된 결과를 꺼내기
			NodeList list = doc.getElementsByTagName("family");
			// 두개가 있어야 한다, getLength() 리스트의 크기 반환
			System.out.println("family 태그 수 : " + list.getLength());

			for (int i = 0; i < list.getLength(); i++) {
				// family 태그에 대한 접근
				Node node = list.item(i);
				// family 태그의 자식 태그에 접근
				NodeList cList = node.getChildNodes();
				System.out.println("family 자식 수 : " + cList.getLength());

				for (int j = 0; j < cList.getLength(); j++) {
					// textNode(엔터), father, mother, me, brother
					Node cNode = cList.item(j);
					// textNode(엔터) 걸러내기
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
