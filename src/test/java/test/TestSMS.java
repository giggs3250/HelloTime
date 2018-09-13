package test;

import java.io.IOException;

import org.json.JSONException;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;

public class TestSMS {

	public static void main(String[] args) {
		// 短信应用SDK AppID
		int appid = 1400135540;
		// 短信应用SDK AppKey
		String appkey = "a22d1923d0f7f372099a8c80d22057b2";

		// 需要发送短信的手机号码
		String[] phoneNumbers = {"/*手机号码*/"};

		// 短信模板ID，需要在短信应用中申请
		int templateId = 187978; 
		//templateId7839对应的内容是"您的验证码是: {1}"
		// 签名
		String smsSign = "HelloTime平台"; // 
		StringBuilder sb = new StringBuilder();	
		for(int i = 0;i<4;i++) {
			String param = ((int)(Math.random()*10))+"";
			sb.append(param);
		}
		String p = sb.toString();
		try {
		    String[] params = {p,"2"};//数组具体的元素个数和模板中变量个数必须一致，例如事例中templateId:5678对应一个变量，参数数组中元素个数也必须是一个
		    SmsSingleSender ssender = new SmsSingleSender(appid, appkey);
		    SmsSingleSenderResult result = ssender.sendWithParam("86", phoneNumbers[0],
		        templateId, params, smsSign, "", "");  // 签名参数未提供或者为空时，会使用默认签名发送短信
		    System.out.println(result);
		} catch (HTTPException e) {
		    // HTTP响应码错误
		    e.printStackTrace();
		} catch (JSONException e) {
		    // json解析错误
		    e.printStackTrace();
		} catch (IOException e) {
		    // 网络IO错误
		    e.printStackTrace();
		}
	}
	
}
