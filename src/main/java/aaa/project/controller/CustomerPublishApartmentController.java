package aaa.project.controller;

import aaa.project.common.DefaultMsg;
import aaa.project.entity.Apartment;
import aaa.project.service.CustomerPublishApartmentService;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * peng
 * 发布房源
 */
@Controller
public class CustomerPublishApartmentController {
    @Autowired
    private CustomerPublishApartmentService customerPublishApartmentService;
    private static List<String> url =new ArrayList<String>();
    /**
     * 发布房源
     * @param apartment
     * @return
     */
    @RequestMapping("/publishApt")
    @ResponseBody
    public DefaultMsg publishApt( HttpSession session,@RequestBody Apartment apartment){
        DefaultMsg dm =customerPublishApartmentService.publishApt(session,apartment,url);
        url.clear();
        return dm;
    }

    /**
     * 图片上传
     * @param file
     * @return
     */
    @RequestMapping("/imgUpload")
    @ResponseBody
    public String  upload(@RequestParam("file") MultipartFile file){
        String imgPath=UUID.randomUUID()+file.getContentType().replace("image/",".");
        System.out.println(imgPath);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("D:/upload/" + imgPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            IOUtils.copy(file.getInputStream(),fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String trueImgUrl="/img/"+imgPath;
        System.out.println(trueImgUrl);
        url.add(trueImgUrl);
        System.out.println(url);
        return null;
    }
}
