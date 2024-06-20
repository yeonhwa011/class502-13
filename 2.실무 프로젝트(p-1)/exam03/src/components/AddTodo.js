import { useEffect } from 'react';
import { MdAdd } from 'react-icons/md';


const AddTodo = ({ onSubmit, onChange, todo ,message}) => {
  useEffect(()=>{     
  console.log("todo값 변경-렌더링후");

  }, [todo]) //[...]//변화감지 기준

  
  useEffect(()=>{
    console.log("message값 변경");
  },[message]);



  
  return (
    <form onSubmit={onSubmit} autoComplete="off">
      <input
        type="text"
        value={todo ?? ''}
        onChange={onChange}
  
      />
      <button type="submit">
        <MdAdd />
      </button>
   
      {message && <div>{message}</div>}
    </form>
  );
};

export default AddTodo;
