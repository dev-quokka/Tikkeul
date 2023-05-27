package com.tikkeul.app.service.mypage;

import com.tikkeul.app.dao.UserDAO;
import com.tikkeul.app.domain.dto.*;
import com.tikkeul.app.domain.vo.ReviewVO;
import com.tikkeul.app.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Qualifier("mypage") @Primary
public class MypageServiceImpl implements MypageService{

    private final UserDAO userDAO;

    public Optional<MypageDTO> getMypage(Long id){
        return userDAO.findMypage(id);
    };


    public void modifyUserVO(String status, Long id){
          userDAO.setUserVO(status,id);
    };

    //후기수정 동찬
    public void modifyhugisujung(Long id,String content){
        userDAO.sethugisujung(id,content);
    };

    public Optional<UserVO> modifycheckpassword(Long id,String password){
        return  userDAO.setcheckpassword(id,password);
    };

    //비밀번호 변경 동찬
    public void modifypassword(String password, Long id){
        userDAO.updatepassword(password,id);
    };

    public List<MyjumoonDTO> getmyjumoon(Long id){
        return userDAO.findmyjumoon(id);
    };

    public List<MyjjimDTO> getallmyjjim(Long id){
        return userDAO.findallmyjjim(id);
    };

    public List<MyjumoonDTO> getallmyjumoonstatus(String status,Long id){
        return userDAO.findmyjumoonstatus(status,id);
    };

    //찜 다시 삽입
    public void setrejjim(Long id, Long itemId){
        userDAO.insertrejjim(id,itemId);
    };

    //찜 삭제
    public void dropjjim(Long id, Long itemId){
        userDAO.deletejjim(id,itemId);
    };


    public void inserthugi(Long id, String content){
         userDAO.inserthugi(id,content);
    };

    public Optional<MyhugiDTO> getmyhugi(Long id){
        return userDAO.findmyhugi(id);
    };

    // 주문상세 동찬
    public Optional<MyjumooncancelDTO> getjumoonsangse(Long id){
        return userDAO.findjumoonsangse(id);
    };
    // 주문취소 후 취소로 변경
    public void insertcancel(Long id, String status){
        userDAO.jumooncancel(id,status);
    };

    // 주문취소 동찬
    public Optional<MyjumooncancelDTO> getcancelfinish(Long id){
        return userDAO.findcancelfinish(id);
    };

    //도란방 조회
    public List<DoranbangDTO> getdoranbang(Long id){
        return userDAO.finddoranbang(id);
    };

    // 구매후기 조회
    public List<GumaehugiDTO> getgumaehugi(Long id){
        return userDAO.findgumaehugi(id);
    };

    // 구매후기상세 조회
    public List<GumaehugiDTO> gethugisangse(Long id){
        return userDAO.findhugisangse(id);
    };

    // 동찬 구매후기 리뷰 찾고수정
    public Optional<HugisujungDTO> getmyhugisujung(Long id){
        return userDAO.findmyhugisujung(id);
    };

    /*public void certifiedPhoneNumber(String phoneNumber, String numStr) {

        String api_key = "###발급받은키";
        String api_secret = "##발급받은키입력";
        Message coolsms = new Message(api_key, api_secret);


        HashMap<String, String> params = new HashMap<String, String>();
        params.put("to", phoneNumber);
        params.put("from", "###본인의 휴대폰번호####");
        params.put("type", "SMS");
        params.put("text", " + 작성할내용 "["+numStr+"]" +내용 ");
        params.put("app_version", "test app 1.2"); // application name and version

        try {
            JSONObject obj = (JSONObject) coolsms.send(params);
            System.out.println(obj.toString());
        } catch (CoolsmsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCode());
        }

    }*/

}

