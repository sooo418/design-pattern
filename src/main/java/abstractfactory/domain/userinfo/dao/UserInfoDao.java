package abstractfactory.domain.userinfo.dao;

import abstractfactory.domain.userinfo.UserInfo;

public interface UserInfoDao {

    public void insertUserInfo(UserInfo userInfo);
    public void deleteUserInfo(UserInfo userInfo);
    public void updateUserInfo(UserInfo userInfo);

}
