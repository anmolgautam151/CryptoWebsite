import React from 'react'
import './App.css';
import Navbar from './components/Navbar' 
import Home from './components/pages/Home'
import { BrowserRouter as Router, Switch ,Route} from 'react-router-dom'
import Bitcoin from './components/pages/Bitcoin'

function App() {
  return (
    <>
    <Router>
      <Navbar />
      <Switch>  
        <Route path='/' exact component = {Home}/>
        <Route path='/bitcoin' component={() => (<Bitcoin param="BTC" />)} />
        <Route path='/ethereum' component={() => (<Bitcoin param="ETH" />)} />
      </Switch>
    </Router>
     
    </>
  );
}

export default App;
