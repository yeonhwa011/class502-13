import {useState,useEffect,useRef} from "react";

const JoinForm = () => {
    
     const[form,setForm] = useState({});

     let userIdEl =useRef();
     
    useEffect(()=> {
    //userIdEl.focus();
    // console.log(userIdEl,current);
    //userIdEl.current.focus();
    console.log(userIdEl.current)
    },[userIdEl]);

     const onChange =(e) =>{
     //set Form ={...form,[e.currentTarget.name]:e.currentTarget.value};
     const name =e.currnetTarget.name;
     const value=e.currnetTarget.value;
     setForm((prevForm) => ({...prevForm,[name]:value}));


     };

     const onSubmit =(e) => {
        e.preventDefault();
        

        setForm({});

     };
    


   return (
    <form onSubmit={onSubmit}>
       <dl>
       <dt>아이디</dt>
       <dd>
        <input 
        type="text" 
        name="userId"
        onChange={onChange}
        value={form.userId ??''}
       // ref={(ref)=>(userIdEl = ref)}
       ref={userIdEl}
           />
       </dd>
       </dl>
       <dl>
        <dt>비밀번호</dt>
        <dd>
            <input type="password"
            name="userPw"
             onChange={onChange}
             value={form.userPw ??''} 
             />
        </dd>
       </dl>
       <dl>
        <dt>비밀번호 확인</dt>
        <dd>
            <input 
            type="password"
             name="confirmPw"
             onChange={onChange} 
             value={form.userPw ??''}
             />        
            </dd>
       </dl>
       <dl>
        <dt>회원명</dt>
        <dd>
            <input type="text"
             name="userNm" 
             onChange={onChange} 
             value={form.userNm ??''}
             />
        </dd>
       </dl>
      <button type="submit">가입하기</button>
    </form>
   );
};

export default JoinForm;
