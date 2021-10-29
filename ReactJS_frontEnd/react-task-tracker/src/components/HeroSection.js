import React from 'react'
import { Button, Button2 } from './Button'
import '../App.css'
import './HeroSection.css'

function HeroSection() {
    return (
        <div className ='hero-container'>
            <video src="/video-2.mp4" autoPlay loop muted/>
            <h1> Bitcoin VS Ethereum </h1>
            <p> Exchange A: BitStamp VS Exchange B: CoinLayer </p>
            <div className = 'hero-btns'> 
                <Button className = 'btns' buttonStyle='btn--outline' buttonSize = 'btn--large'>
                    BITCOIN <i class="fab fa-btc"></i></Button>
                <Button2 className = 'btns' buttonStyle='btn--outline' buttonSize = 'btn--large'>
                    ETHERIUM <i class="fab fa-ethereum"></i></Button2>
            </div>

        </div>
    )
}

export default HeroSection
