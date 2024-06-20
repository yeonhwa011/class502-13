import { Component } from 'react';

class LifeCycle extends Component {
  state = {
    number: 0,
  };

  constructor(props) {
    super(props);

    console.log('constructor');
  }

  static getDerivedStateFromProps(prevProps, prevState) {
    console.log('getDerivedStateFromProps');
    if (prevProps.mode === 'even' && prevState.number % 2 === 1) {
      return { number: prevState.number + 1 };
    }

    return null;
  }

  shouldComponentUpdate(props, state) {
    //return state.number % 3 !== 0;
    return true;
    /*
    if (state.number % 3 === 0) {
      
      return false;
    }

    return true;
    */
  }

  componentDidMount() {
    console.log('componentDidMount');
  }

  getSnapshotBeforeUpdate(props, state) {
    console.log('getSnapshotBeforeUpdate');

    return { value: 100 };
  }

  componentDidUpdate(props, state, snapshot) {
    console.log('componentDidUpdate');
    console.log('snapshot', snapshot);
  }

  componentWillUnmount() {
    console.log('componentWillUnmount');
  }

  render() {
    console.log('render');
    try {
      number.abc();
    }catch (err) {
      console.log(err.message);
      console.log(err);
      console.log("에러 처리...");
    } 
   const { number } = this.state;
    //number.abc();

   //throw new Error("에러발생!!!");
    return (
      <>
        <h1>{number}</h1>
        <button
          type="button"
          onClick={() => this.setState({ number: number + 1 })}
        >
          +1
        </button>
        <button
          type="button"
          onClick={() => this.setState({ number: number - 1 })}
        >
          -1
        </button>
      </>
    );
  }
}

export default LifeCycle;