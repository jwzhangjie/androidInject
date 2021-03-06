package com.wangjie.androidinject;

import com.wangjie.androidinject.annotation.annotations.net.AIGet;
import com.wangjie.androidinject.annotation.annotations.net.AIParam;
import com.wangjie.androidinject.annotation.annotations.net.AIPost;
import com.wangjie.androidinject.annotation.annotations.net.AIUpload;
import com.wangjie.androidinject.annotation.core.net.RetMessage;
import com.wangjie.androidinject.annotation.util.Params;
import com.wangjie.androidinject.model.Person;
import com.wangjie.androidinject.model.UploadFile;

import java.io.File;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: wangjie  email:wangjie@cyyun.com
 * Date: 14-2-7
 * Time: 下午1:44
 */
public interface PersonWorker {
    @AIGet("http://192.168.2.198:8080/HelloSpringMVC/person/findPersons?aa=#{a3}&bb=#{b3}&cc=#{c3}")
    public RetMessage<Person> getPersonsForGet(@AIParam("a3")String a2, @AIParam("b3") String b2, @AIParam("c3") String c2) throws Exception;

    @AIPost("http://192.168.2.198:8080/HelloSpringMVC/person/findPersons")
    public RetMessage<Person> getPersonsForPost(@AIParam("aa")String a2, @AIParam("bb") String b2, @AIParam("cc") String c2) throws Exception;


    @AIGet(value = "http://192.168.2.198:8080/HelloSpringMVC/person/findPersons", connTimeout = 12345, soTimeout = 54321)
    public RetMessage<Person> getPersonsForGet2(Params params) throws Exception;

    @AIPost(value = "http://192.168.2.198:8080/HelloSpringMVC/person/findPersons", connTimeout = 30000, soTimeout = 25000)
    public RetMessage<Person> getPersonsForPost2(Params params) throws Exception;

    @AIUpload("http://192.168.2.198:8080/HelloSpringMVC/upload/uploadFiles")
    public RetMessage<UploadFile> uploadFile(List<File> files) throws Exception;

    @AIUpload("http://192.168.2.198:8080/HelloSpringMVC/upload/uploadFiles")
    public RetMessage<UploadFile> uploadFile2(File file) throws Exception;


}
