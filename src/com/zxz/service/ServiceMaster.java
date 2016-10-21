package com.zxz.service;

import org.apache.mina.common.IoSession;
import org.json.JSONObject;

public class ServiceMaster {

	JSONObject jsonObject;
	// UserService userService = new UserService();
	// PlayGameService playGameService = new PlayGameService();
	// SettingService settingService = new SettingService();
	// ServerService serverService = new ServerService();
	public ServiceMaster() {
	}
	public ServiceMaster(JSONObject jsonObject) {
		super();
		this.jsonObject = jsonObject;
	}

	public void serviceStart(IoSession session, JSONObject jsonObject) {
		String method = jsonObject.getString("method");
		if (method == null) {
			session.write("method is null");
			return;
		}
		hongZhongMaster(session, jsonObject);
	}

	private void hongZhongMaster(IoSession session, JSONObject jsonObject) {
		String method = jsonObject.getString("method");
		PlayOfHongZhong playOfHongZhong = new UserService();
		switch (method) {
		case "login":
			playOfHongZhong.login(jsonObject, session);// ��¼
			break;
		case "createRoom":
			playOfHongZhong.createRoom(jsonObject, session);// ��������
			break;
		case "enterRoom":
			playOfHongZhong.enterRoom(jsonObject, session);// ���뷿��
			break;
		case "readyGame":
			playOfHongZhong.readyGame(jsonObject, session);// ׼����Ϸ
			break;
		case "playGame":
			playOfHongZhong.playGame(jsonObject, session);// ��ʼ����
			break;
		case "disbandRoom":
			playOfHongZhong.disbandRoom(jsonObject, session);// ��ɢ����
			break;
		case "getMyInfo":
			playOfHongZhong.getMyInfo(jsonObject, session);// �õ����Լ�����Ϣ
			break;
		case "leaveRoom":
			playOfHongZhong.leaveRoom(jsonObject, session);// �뿪����
			break;
		case "getSettingInfo":
			playOfHongZhong.getSetting(jsonObject, session);// �õ��Լ���������Ϣ
			break;
		case "getServerInfo":
			playOfHongZhong.getServerInfo(jsonObject, session);// �õ�ʣ�����
			break;
		case "continueGame":
			playOfHongZhong.continueGame(jsonObject, session);// ������Ϸ
			break;
		case "settingAuto":
			playOfHongZhong.settingAuto(jsonObject, session);// �����й�
			break;
		case "cancelAuto":
			playOfHongZhong.cancelAuto(jsonObject, session);// ȡ���й�
			break;
		case "downGameInfo":
			playOfHongZhong.downGameInfo(jsonObject, session);// ��������
			break;
		case "getUserScore":
			playOfHongZhong.getUserScore(jsonObject, session);// �õ�ս��
			break;
		case "recommend":
			playOfHongZhong.recommend(jsonObject, session);//�����Ƽ���
			break;
		case "playAudio":
			playOfHongZhong.playAudio(jsonObject, session);//������Ϣ
			break;
		}
	}

}