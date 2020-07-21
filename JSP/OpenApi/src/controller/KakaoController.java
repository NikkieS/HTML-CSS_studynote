package controller;

import javax.servlet.http.HttpSession;

public class KakaoController {
	private final static String K_CLIENT_ID = "df3eb3e523464f31602de3d2b16ae082";
	
	private final static String K_REDIRECT_URI = "http://localhost:8080/kakaologin.do";
	
	public static String getAuthorizationUrl(HttpSession session) {
		String kakaoUrl = "https://kauth.kakao.com/oauth/authorize?client_id="+K_CLIENT_ID+"&redirect_uri="+K_REDIRECT_URI+"&response_type=code";
		
		return kakaoUrl;
	}

}
