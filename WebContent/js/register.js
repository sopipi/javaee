//提交之前进行检查，如果return false，则不允许提交
    function submitCheck(){
//根据ID获取值
        var username=document.getElementById("userName").value;
        var studentId=document.getElementById("studentId").value;
        var sex=document.getElementById("sex").value;
        var college=document.getElementById("college").value;
        var major=document.getElementById("major").value;
        var introduce=document.getElementById("introduce").value;
        
        if(username==""){ alert("用户名不能为空");
            return false; }
        if(studentId==""){ alert("学号不能为空");
        return false; }
        if(sex==""){ alert("性别不能为空");
        return false; }
        if(college==""){ alert("学院不能为空");
        return false; }
        if(major==""){ alert("专业不能为空");
        return false; }
        if(introduce==""){ alert("个人介绍不能为空");
        return false; }
        return true;
    }
    
