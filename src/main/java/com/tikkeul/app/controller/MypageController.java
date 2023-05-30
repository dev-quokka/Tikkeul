package com.tikkeul.app.controller;
import com.tikkeul.app.domain.dto.*;
import com.tikkeul.app.domain.vo.ReviewVO;
import com.tikkeul.app.domain.vo.SavingVO;
import com.tikkeul.app.domain.vo.UserVO;
import com.tikkeul.app.service.mypage.MypageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
@Slf4j
@RequestMapping("/mypage/*")
@RequiredArgsConstructor
public class MypageController {

    private final MypageService mypageService;
    private final HttpSession session;

    @GetMapping("mypage")
    public void read(Model model)
    {
        model.addAttribute("k",mypageService.getMypage((Long)session.getAttribute("id")).get());
    }

    @GetMapping("DropOutUser")
    public void goTodropuser(UserVO userVO){;}


    @PostMapping("drop")
    public RedirectView modify(UserVO userVO){
        log.info(userVO.getStatus());
        mypageService.modifyUserVO(userVO.getStatus(),(Long)session.getAttribute("id"));
        return new RedirectView("/mypage/mypage");
    }


    //    비밀번호 체크
    @GetMapping("check-password/{password}")
    @ResponseBody
    public boolean checkId(@PathVariable String password){
        return mypageService.modifycheckpassword((Long)session.getAttribute("id"),password).isPresent();
    }

    @GetMapping("chagepassword")
    public void goTochagepass(UserVO userVO){

        ;}


   @PostMapping("passchangee")
    public RedirectView modifypassword(UserVO userVO){
        mypageService.modifypassword(userVO.getPassword(),(Long)session.getAttribute("id"));
        log.info(userVO.getPassword());
        return new RedirectView("/mypage/mypage") ;
    }

    @GetMapping("gumaehugi")
    public void hugilist(Model model,ReviewVO reviewVO){
        model.addAttribute("hugi",mypageService.getmyhugi((Long)session.getAttribute("id")).get());
    }

    @PostMapping("huhu")
    public RedirectView hugiwrite(ReviewVO reviewVO){
        Long id=0L;
        mypageService.inserthugi((Long)session.getAttribute("id"),reviewVO.getContent());
        return new RedirectView("/mypage/mypage");
    }


    @GetMapping("gumaehugisujung")
    public void hugilistchange(Model model){
        Long id = 0L;
        model.addAttribute("hugi",mypageService.getmyhugi((Long)session.getAttribute("id")).get());
        model.addAttribute("hugisujung",mypageService.getmyhugisujung((Long)session.getAttribute("id")).get());
    }

    @PostMapping("huhuchange")
    public RedirectView hugiwritechange(HugisujungDTO hugisujungDTO){
        Long id=0L;
        mypageService.modifyhugisujung((Long)session.getAttribute("id"),hugisujungDTO.getContent());
        return new RedirectView("/mypage/mypage");
    }



    @GetMapping("jumoonneyuk")
    public void myjumoonlist(Model model){
        model.addAttribute("datas",mypageService.getmyjumoon((Long)session.getAttribute("id")));
    }


    @GetMapping("jjim")
    public void myjjim(Model model) {
        model.addAttribute("jjims", mypageService.getallmyjjim((Long)session.getAttribute("id")));
    }


    @GetMapping("nojjim/{itemId}")
    @ResponseBody
    public void nojjim(@PathVariable Long itemId){
        log.info("찜삭제");
        mypageService.dropjjim((Long)session.getAttribute("id"),itemId);
    }


    @GetMapping("jjimregogo/{itemId}")
    @ResponseBody
    public void jjimregogo(@PathVariable Long itemId){
        log.info("찜삽입");
        mypageService.setrejjim((Long)session.getAttribute("id"),itemId);
    }




    @GetMapping("status-id/{status}")
    @ResponseBody
    public List<MyjumoonDTO> myjumoonstatus(@PathVariable String status){

        log.info(status);
        log.info("전체");

            if(status.equals("전체")){
                return mypageService.getmyjumoon((Long)session.getAttribute("id"));
            }

            else {
                return mypageService.getallmyjumoonstatus(status, (Long)session.getAttribute("id"));
            }

    }

    @GetMapping("jumoonsangse")
    public void jumoonsangse(Model model){
        model.addAttribute("k",mypageService.getjumoonsangse((Long)session.getAttribute("id")).get())
        ;}

    @PostMapping("cancel")
    public RedirectView jumoonsangsecancel(){
        String status = "주문취소";
        mypageService.insertcancel((Long)session.getAttribute("id"),status);
       return new RedirectView("/mypage/jumoonneyuk");
        }

    @GetMapping("jumooncancel")
    public void jumooncancel(Model model){
        MyjumooncancelDTO op = new MyjumooncancelDTO();
        model.addAttribute("k2",mypageService.getjumoonsangse((Long)session.getAttribute("id")).get())
        ;}

    @GetMapping("mypage-doranbang")
    public void dorangbang(Model model){
        model.addAttribute("datass",mypageService.getdoranbang((Long)session.getAttribute("id")))
        ;}


    @GetMapping("mypage-review")
    public void gumaehugimukruk(Model model){
        model.addAttribute("datass",mypageService.getgumaehugi((Long)session.getAttribute("id")))
        ;}


    @GetMapping("mypage-review-details")
    public void hugisangse(Model model){
        model.addAttribute("kkk",mypageService.gethugisangse((Long)session.getAttribute("id")))
        ;}

    @GetMapping("mytikkle")
    public void goTomytikkle(Model model){
        model.addAttribute("ppoos",mypageService.getmytikkle((Long)session.getAttribute("id")));

        ;}

    @ResponseBody
    @PostMapping("/mypage/insertmytikkle")
    public boolean mytikklePOST(@RequestBody SavingVO savingVO) throws Exception {

        mypageService.settikkle(savingVO);
        return true;
    }


     @GetMapping("/selectmytikkle/{date}")
     @ResponseBody
     public Long mytikklecheckid(@PathVariable String date){
        return mypageService.getmytikkleid((Long)session.getAttribute("id"),date);
     }



    @ResponseBody
    @PostMapping("/mypage/mytikklesujung/{k}")
    public boolean mytikklePOSTsujung(@RequestBody Long k) throws Exception {
        mypageService.modifymytikkle(k);
        return true;
    }


    @GetMapping("/mytikklesujung/{date}")
    @ResponseBody
    public Long mytikklecheckidsujung(@PathVariable String date){
        log.info("2");
        return mypageService.getmytikkleid((Long)session.getAttribute("id"),date);
    }


    @GetMapping("Updatebasicinfo")
    public void goTodjumoon233d(){;}


}

