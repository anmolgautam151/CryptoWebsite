import React from 'react';
import '../../App.css';

export default class Bitcoin extends React.Component {

    constructor(props) {
        super(props);
        console.log(this.props);
        this.state = { 
            param: this.props.param, 
            price: null 
        };
    }

    componentDidMount() {
        fetch(`http://localhost:8080/info?currency=${this.state.param}`)
            .then(response => response.json())
            .then(data => {
                console.log(data);
                this.setState({ price: data });
            })
            .catch(err => console.log(err))
    }
    

    render() {
        return (
            <div className='bitcoin'>
                <div className='bitcoin2'>
                <ul>
                    <li>BitStamp: {this.state.price?.BitStamp}</li>
                    <li>CoinLayer: {this.state.price?.CoinLayer}</li>
                    <li>Recommended: {this.state.price?.Recommended}</li>
                </ul>
                </div>
            </div>
        )
    }
}