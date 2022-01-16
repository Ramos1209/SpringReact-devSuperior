import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './style.css'

function NavBar(){
    return (
        <header>
        <nav className="container">
            <div className="dsmovie-nav-content">
                <h1>DSMovie</h1>
                <a href="https://github.com/Ramos1209" target="_blank" rel="noreferrer">
                    <div className="dsmovie-contact-container">
                        <GithubIcon />
                        <p className="dsmovie-contact-link">/R@mos1209</p>
                    </div>
                </a>
            </div>
        </nav>
    </header>
    );
}
export default NavBar;