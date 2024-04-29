package basic.exercise.interfaces;

public class UserInfoClient {

	public static void main(String[] args) {

		// 사용자에게 정보를 입력하세요-->Scanner 활용
		String inputUserName = "홍길동";
		String inpuUserPw = "asd123";

		// DTO :데이터를 받아서(취합,가공 ) 전달하는 역할을 가지고 있는 인스턴스를 말한다.
		UserInfo userinfo = new UserInfo(inputUserName, inpuUserPw);
		// 데이터를 받아서 IUserInfoDao를 구현한 구현 클래스에게 전달하고자 한다
//		IUserInfoDao iUserInfoDao1 = new UserInfoMySqlDaoImpl();
		IUserInfoDao iUserInfoDao1 = new UserInfoOracleDaoImpl();

		iUserInfoDao1.insertUserInfo(userinfo);
		iUserInfoDao1.updateUserInfo(userinfo);
		iUserInfoDao1.deleteUserInfo(userinfo.getId());
		iUserInfoDao1.selectUserInfo();

	}

}
