package com.aan.netty.com.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.lang.StringEscapeUtils;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.IOException;
import java.io.StringReader;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lainc on 4/19/2017.
 */
public class parce{
    public static void main(String[] args) {
//        XmlMapper xmlMapper = new XmlMapper();
//        try {
//            SimpleBean value =  xmlMapper.readValue("<SimpleBean><x>*&^^^1</x><y>2</y></SimpleBean>", SimpleBean.class);
//            System.out.println("value : "+value);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        try {
//            String escapedXml = StringEscapeUtils.escapeXml("the data might contain & or ! or % or ' or # etc");

            String xml2 = "<SimpleBean><x>*&^^^1</x><y>2</y></SimpleBean>";
            String xml = "<SimpleBean>&Gepäck</SimpleBean>";
//            xml = URLEncoder.encode(xml, "UTF-8");
//            xml = StringEscapeUtils.escape(xml);
//            System.out.println("escapeXml:"+xml);
            for(Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key+"=="+value);
                xml = xml.replace(key, value);
                // do what you have to do here
                // In your case, an other loop.
            }
            System.out.println("escapeXml:"+xml);
            org.jdom.input.SAXBuilder saxBuilder = new SAXBuilder();
            org.jdom.Document doc = saxBuilder.build(new StringReader(xml));
            String message = doc.getRootElement().getName();
            System.out.println(message);


//            String xmlString = param1AfterEncoding;//"<test><tag xml:lang=\"123\"></tag></test>";
//            System.out.println(xmlString);
//            SAXBuilder builder = new SAXBuilder();
//
//            StringReader stringReader = new StringReader(new String(xmlString.getBytes()));
//
//            Document doc = builder.build(stringReader);
//            String message = doc.getRootElement().getName();

        } catch (JDOMException e) {
            // handle JDOMException
            e.printStackTrace();
        } catch (IOException e) {
            // handle IOException
            e.printStackTrace();
        }
    }

    static Map<String, String> map = new HashMap<>();
    static {
        map.put("&","&amp;");
//        map.put("<","&lt");
//        map.put(">","&gt");
//        map.put("\"","quot");
        map.put("'","&apos;");
    }
}
