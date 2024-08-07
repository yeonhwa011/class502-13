import React, {useState,useCallback ,useMemo} from 'react';
function getAverage(nums) {
    //합계 /갯수 

    const total = nums.reduce((acc,num) =>{
     acc+=nums;
     
     return acc;
    },0);

    let avg =total/nums.lengh;
    avg =Math.round(avg *10)/100; //소수점 첫째 자리까지 표기(반올림)

    return avg;
} 

const Average =() => {
    const [nums,setNums]=useState([]);
    const[num,setNum]=useState('');
 
    const onChange = useCallback(
     (e) =>
        setNum(
           Number(e.currentTarget.value) !== NaN
        ? Number(e.currentTarget.value)
             : 0, 
             ),
            [],
        );
     const onSubmit= useCallback(
        (e) => {
        e.preventDefault();
        setNums((nums) => nums.concat(num));
     },
     [num],
    );

   // const avg =getAverage(nums);
   const avg =useMemo(()=>getAverage(nums),[nums]);

     return(
        <>
          <form autoComplete='off' onSubmit={onSubmit}>
            <input type='number' value={num} onChange={onChange}/>
            <button type='submit'>등록</button>
          </form>
          <ul>
            {nums.map((num,i) =>(
                    <li key={i}>{num}</li>

                ))}
            </ul>
            평균:{avg}
        </>
     );
};

export default React.memo(Average);