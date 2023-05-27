package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.dto.*;
import com.tikkeul.app.domain.vo.ReviewVO;
import com.tikkeul.app.domain.vo.UserVO;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {


//  관리자페이지에서 회원 리스트 조회

    //  관리자페이지에서 회원 리스트 조회

    public List<UserVO> adminSelectUserAll();

    // 관리자페이지에서 회원 삭제
    public void adminDeleteUser(Long id);


    //    아이디 중복검사
    public Optional<UserVO> selectByUserId(String identification);

    //    회원가입
    public void insert(UserVO userVO);

    //    로그인
    @Select("SELECT ID FROM USERS WHERE ID = #{id} AND PASSWORD = #{password}")
    public Optional<Long> selectByUserIdAndUserPassword(@Param("id") String id, @Param("password") String password);

    //ㅁㅏ이페이지 동찬
    public Optional<MypageDTO> select(Long id);

    //회원탈퇴 동찬
    public void update(String status, Long id);

    //비밀번호 변경 동찬
    public void updatepassword(String password, Long id);

    //후기수정 동찬
    public void updatehugisujung(Long id,String content);

    //비밀번호 재설정 동찬
    public Optional<UserVO> selectcheckpassword(Long id, String password);

    //나의 구매 목록 동찬
    public List<MyjumoonDTO> selectallmyjumoon(Long id);

    //나의 구매 목록 상태 에이작스 동찬
    public List<MyjumoonDTO> selectmyjumoonstatus(String status, Long id);

    //나의 찜 목록 동찬
    public List<MyjjimDTO> selectallmyjjim(Long id);

    // 구매후기 상품 찾기
    public Optional<MyhugiDTO> selectmyhugi(Long id);

    // 구매후기 리뷰 찾고수정
    public Optional<HugisujungDTO> selectmyhugisujung(Long id);

    // 구매후기 동찬
    public void inserthugi(Long id, String content);

    //찜 다시 삽입
    public void insertrejjim(Long id, Long itemId);

    //찜 삭제
    public void deletejjim(Long id, Long itemId);

    // 주문상세 동찬
    public Optional<MyjumooncancelDTO> selectjumoonsangse(Long id);

    // 주문취소 후 취소로 변경
    public void jumooncancel(Long id, String status);

    // 주문취소 동찬
    public Optional<MyjumooncancelDTO> selectcancelfinish(Long id);

    //도란방 조회
    public List<DoranbangDTO> selectdoranbang(Long id);

    // 구매후기 조회
    public List<GumaehugiDTO> gumaehugimukruk(Long id);

    // 구매후기상세 조회
    public List<GumaehugiDTO> selecthugisangse(Long id);


}
