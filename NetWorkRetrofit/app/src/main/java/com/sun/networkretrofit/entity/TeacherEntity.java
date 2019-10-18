package com.sun.networkretrofit.entity;

import java.util.List;

public class TeacherEntity {

    /**
     * id : 4644
     * nick : 贝琳达
     * remarkName : null
     * avatar : http://oss.icoachu.cn/teacherInfo/4644/avatar/images/33ccbe978f8d43a2a5a311d7513004f2icoachu_backend_1520044605000
     * cover : null
     * birthday : 323625600000
     * video : null
     * videoImg : null
     * gender : 0
     * score : 5
     * lessonCount : 14
     * intro : 盛开时节，春风徐来，飘落起阵阵樱花雨，使人恍惚间仿佛置身于东京的上野公园。早樱尚未落尽，桃花便接踵而至，红、白、粉三色碧桃一齐绽放，红的温馨、白的清雅、粉的浪漫。每年这个时节，一波波即将毕业的俊男靓女在此流连忘返，拍照留念，人面桃花交相辉映，让留在校园中的人不时会有"人面不知何处去，桃花年年笑春风"的感慨。
     * audio : http://oss.icoachu.cn/teacherInfo/4644/certification/1520044806349.mp3/9570d77ae5ea43ae990a3736d856729ficoachu_backend_1520044806000
     * audioSec : 31
     * followerCount : 3
     * isFollowed : false
     * title : samebbbbbb
     * techLevel : 2
     * techLevelDesc : 特聘讲师
     * labelList : [{"id":127,"labelName":"吉他"},{"id":128,"labelName":"跳舞"},{"id":123,"labelName":"摄影"},{"id":130,"labelName":"美剧"}]
     * propList : [{"id":104,"pId":31,"name":"美式发音","value":53,"orderNumber":3,"sname":"美式英语","techId":null}]
     * roleType : 0,1,4
     * officialStatus : 3
     * organization : null
     * country : {"id":7,"name":"中国","parentId":0,"isChild":1,"nationFlag":"http://oss.icoachu.cn/icoachu_backend/image/1539228261019"}
     * countryImg : null
     * province : {"id":110000,"name":"北京","parentId":7,"isChild":1,"nationFlag":null}
     * city : {"id":110100,"name":"北京市","parentId":110000,"isChild":1,"nationFlag":null}
     * nation : null
     * commentCount : 1
     * saleLson : 4
     * postNum : 0
     * techAge : null
     * qualList : null
     * location : null
     * lsonVideos : null
     * nowDate : 1571360605270
     * followed : false
     */

    private int id;
    private String nick;
    private Object remarkName;
    private String avatar;
    private Object cover;
    private long birthday;
    private Object video;
    private Object videoImg;
    private int gender;
    private int score;
    private int lessonCount;
    private String intro;
    private String audio;
    private int audioSec;
    private int followerCount;
    private boolean isFollowed;
    private String title;
    private int techLevel;
    private String techLevelDesc;
    private String roleType;
    private int officialStatus;
    private Object organization;
    private CountryBean country;
    private Object countryImg;
    private ProvinceBean province;
    private CityBean city;
    private Object nation;
    private int commentCount;
    private int saleLson;
    private int postNum;
    private Object techAge;
    private Object qualList;
    private Object location;
    private Object lsonVideos;
    private long nowDate;
    private boolean followed;
    private List<LabelListBean> labelList;
    private List<PropListBean> propList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Object getRemarkName() {
        return remarkName;
    }

    public void setRemarkName(Object remarkName) {
        this.remarkName = remarkName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Object getCover() {
        return cover;
    }

    public void setCover(Object cover) {
        this.cover = cover;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public Object getVideo() {
        return video;
    }

    public void setVideo(Object video) {
        this.video = video;
    }

    public Object getVideoImg() {
        return videoImg;
    }

    public void setVideoImg(Object videoImg) {
        this.videoImg = videoImg;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLessonCount() {
        return lessonCount;
    }

    public void setLessonCount(int lessonCount) {
        this.lessonCount = lessonCount;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public int getAudioSec() {
        return audioSec;
    }

    public void setAudioSec(int audioSec) {
        this.audioSec = audioSec;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    public boolean isIsFollowed() {
        return isFollowed;
    }

    public void setIsFollowed(boolean isFollowed) {
        this.isFollowed = isFollowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTechLevel() {
        return techLevel;
    }

    public void setTechLevel(int techLevel) {
        this.techLevel = techLevel;
    }

    public String getTechLevelDesc() {
        return techLevelDesc;
    }

    public void setTechLevelDesc(String techLevelDesc) {
        this.techLevelDesc = techLevelDesc;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public int getOfficialStatus() {
        return officialStatus;
    }

    public void setOfficialStatus(int officialStatus) {
        this.officialStatus = officialStatus;
    }

    public Object getOrganization() {
        return organization;
    }

    public void setOrganization(Object organization) {
        this.organization = organization;
    }

    public CountryBean getCountry() {
        return country;
    }

    public void setCountry(CountryBean country) {
        this.country = country;
    }

    public Object getCountryImg() {
        return countryImg;
    }

    public void setCountryImg(Object countryImg) {
        this.countryImg = countryImg;
    }

    public ProvinceBean getProvince() {
        return province;
    }

    public void setProvince(ProvinceBean province) {
        this.province = province;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public Object getNation() {
        return nation;
    }

    public void setNation(Object nation) {
        this.nation = nation;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getSaleLson() {
        return saleLson;
    }

    public void setSaleLson(int saleLson) {
        this.saleLson = saleLson;
    }

    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    public Object getTechAge() {
        return techAge;
    }

    public void setTechAge(Object techAge) {
        this.techAge = techAge;
    }

    public Object getQualList() {
        return qualList;
    }

    public void setQualList(Object qualList) {
        this.qualList = qualList;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Object getLsonVideos() {
        return lsonVideos;
    }

    public void setLsonVideos(Object lsonVideos) {
        this.lsonVideos = lsonVideos;
    }

    public long getNowDate() {
        return nowDate;
    }

    public void setNowDate(long nowDate) {
        this.nowDate = nowDate;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

    public List<LabelListBean> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<LabelListBean> labelList) {
        this.labelList = labelList;
    }

    public List<PropListBean> getPropList() {
        return propList;
    }

    public void setPropList(List<PropListBean> propList) {
        this.propList = propList;
    }

    public static class CountryBean {
        /**
         * id : 7
         * name : 中国
         * parentId : 0
         * isChild : 1
         * nationFlag : http://oss.icoachu.cn/icoachu_backend/image/1539228261019
         */

        private int id;
        private String name;
        private int parentId;
        private int isChild;
        private String nationFlag;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getParentId() {
            return parentId;
        }

        public void setParentId(int parentId) {
            this.parentId = parentId;
        }

        public int getIsChild() {
            return isChild;
        }

        public void setIsChild(int isChild) {
            this.isChild = isChild;
        }

        public String getNationFlag() {
            return nationFlag;
        }

        public void setNationFlag(String nationFlag) {
            this.nationFlag = nationFlag;
        }
    }

    public static class ProvinceBean {
        /**
         * id : 110000
         * name : 北京
         * parentId : 7
         * isChild : 1
         * nationFlag : null
         */

        private int id;
        private String name;
        private int parentId;
        private int isChild;
        private Object nationFlag;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getParentId() {
            return parentId;
        }

        public void setParentId(int parentId) {
            this.parentId = parentId;
        }

        public int getIsChild() {
            return isChild;
        }

        public void setIsChild(int isChild) {
            this.isChild = isChild;
        }

        public Object getNationFlag() {
            return nationFlag;
        }

        public void setNationFlag(Object nationFlag) {
            this.nationFlag = nationFlag;
        }
    }

    public static class CityBean {
        /**
         * id : 110100
         * name : 北京市
         * parentId : 110000
         * isChild : 1
         * nationFlag : null
         */

        private int id;
        private String name;
        private int parentId;
        private int isChild;
        private Object nationFlag;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getParentId() {
            return parentId;
        }

        public void setParentId(int parentId) {
            this.parentId = parentId;
        }

        public int getIsChild() {
            return isChild;
        }

        public void setIsChild(int isChild) {
            this.isChild = isChild;
        }

        public Object getNationFlag() {
            return nationFlag;
        }

        public void setNationFlag(Object nationFlag) {
            this.nationFlag = nationFlag;
        }
    }

    public static class LabelListBean {
        /**
         * id : 127
         * labelName : 吉他
         */

        private int id;
        private String labelName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLabelName() {
            return labelName;
        }

        public void setLabelName(String labelName) {
            this.labelName = labelName;
        }
    }

    public static class PropListBean {
        /**
         * id : 104
         * pId : 31
         * name : 美式发音
         * value : 53
         * orderNumber : 3
         * sname : 美式英语
         * techId : null
         */

        private int id;
        private int pId;
        private String name;
        private int value;
        private int orderNumber;
        private String sname;
        private Object techId;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getPId() {
            return pId;
        }

        public void setPId(int pId) {
            this.pId = pId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getOrderNumber() {
            return orderNumber;
        }

        public void setOrderNumber(int orderNumber) {
            this.orderNumber = orderNumber;
        }

        public String getSname() {
            return sname;
        }

        public void setSname(String sname) {
            this.sname = sname;
        }

        public Object getTechId() {
            return techId;
        }

        public void setTechId(Object techId) {
            this.techId = techId;
        }
    }
}
