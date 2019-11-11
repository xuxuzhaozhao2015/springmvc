package top.xuxuzhaozhao.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("file")
public class FileUploadController {

    @RequestMapping("upload")
    public String Upload(Model model, HttpServletRequest request) throws Exception {

        String realPath = request.getSession().getServletContext().getRealPath("/uploads/");
        File file = new File(realPath);
        if (!file.exists()) file.mkdir();

        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);

        List<FileItem> fileItems = upload.parseRequest(request);
        for (FileItem item : fileItems) {
            if (item.isFormField()) {
                //是普通表单项
            } else {
                //上传文件项
                //获取上传文件名
                String name = item.getName();
                //设置文件唯一值
                String uuid = UUID.randomUUID().toString().replace("-", "");
                name = uuid + "_" + name;
                //完成上传文件
                item.write(new File(realPath, name));
                //删除临时文件
                item.delete();
            }
        }
        model.addAttribute("msg", realPath);

        return "success";
    }

    /**
     * MultipartFile参数名需与表单name相同
     */
    @RequestMapping("springupload")
    public String UploadSpring(Model model, HttpServletRequest request, MultipartFile upload) throws IOException {
        String path = request.getSession().getServletContext().getRealPath("/uploads/spring/");
        File dic = new File(path);
        if (!dic.exists()) dic.mkdir();

        String fileName = upload.getName();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        fileName = uuid + "_" + fileName;

        upload.transferTo(new File(path, fileName));

        model.addAttribute("msg", path);
        return "success";
    }

    /**
     * 跨服务器上传(需要启用com.sun.jersey包)
     */
    @RequestMapping("springupload_cros")
    public String UploadSpringCros( MultipartFile upload) throws IOException {
        //定义上传文件服务器路径
        String remotePath = "http://localhost:8081/uploads/";

        String fileName = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        fileName = uuid + "_" + fileName;

        // 创建客户端连接
        Client client = Client.create();

        // 和图片服务器进行连接
        WebResource resource = client.resource(remotePath + fileName);

        // 上传
        resource.put(upload.getBytes());

        //model.addAttribute("msg", remotePath+fileName);
        return "success";
    }
}
























































