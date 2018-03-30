package com.test.httpandroid.mode;

/**
 * Created by 腾翔信息 on 2017/8/28.
 */

public class LoginMode {

    private String result;
    private String message;
    private LoginData data;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public LoginData getData() {
        return data;
    }

    public void setData(LoginData data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public class LoginData{
        private MemberInfo member;

        public MemberInfo getMember() {
            return member;
        }

        public void setMember(MemberInfo member) {
            this.member = member;
        }

        public class MemberInfo{
            private String account_security_level;
            private String disabled;
            private String state;
            private String member_id;
            private String lv_id;
            private String uname;
            private String email;
            private String regtime;
            private String name;
            private String sex;
            private String point;
            private String lastlogin;
            private String logincount;
            private String mp;
            private String lvname;
            private String registerip;
            private String nickname;
            private String midentity;
            private Integer store_id;

            public String getAccount_security_level() {
                return account_security_level;
            }

            public void setAccount_security_level(String account_security_level) {
                this.account_security_level = account_security_level;
            }

            public String getDisabled() {
                return disabled;
            }

            public void setDisabled(String disabled) {
                this.disabled = disabled;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getMember_id() {
                return member_id;
            }

            public void setMember_id(String member_id) {
                this.member_id = member_id;
            }

            public String getLv_id() {
                return lv_id;
            }

            public void setLv_id(String lv_id) {
                this.lv_id = lv_id;
            }

            public String getUname() {
                return uname;
            }

            public void setUname(String uname) {
                this.uname = uname;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getRegtime() {
                return regtime;
            }

            public void setRegtime(String regtime) {
                this.regtime = regtime;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            public String getPoint() {
                return point;
            }

            public void setPoint(String point) {
                this.point = point;
            }

            public String getLastlogin() {
                return lastlogin;
            }

            public void setLastlogin(String lastlogin) {
                this.lastlogin = lastlogin;
            }

            public String getLogincount() {
                return logincount;
            }

            public void setLogincount(String logincount) {
                this.logincount = logincount;
            }

            public String getMp() {
                return mp;
            }

            public void setMp(String mp) {
                this.mp = mp;
            }

            public String getLvname() {
                return lvname;
            }

            public void setLvname(String lvname) {
                this.lvname = lvname;
            }

            public String getRegisterip() {
                return registerip;
            }

            public void setRegisterip(String registerip) {
                this.registerip = registerip;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getMidentity() {
                return midentity;
            }

            public void setMidentity(String midentity) {
                this.midentity = midentity;
            }

            public Integer getStore_id() {
                return store_id;
            }

            public void setStore_id(Integer store_id) {
                this.store_id = store_id;
            }
        }

    }
}
