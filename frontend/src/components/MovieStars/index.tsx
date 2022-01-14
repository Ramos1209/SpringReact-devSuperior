import {ReactComponent as StarFull} from 'assets/img/star.svg';
import {ReactComponent as StarHalf} from 'assets/img/star-rawf.svg';
import {ReactComponent as StarEmpty} from 'assets/img/star-enpty.svg';
import './style.css'

function MovieStars() {
    return (
<div className="dsmovie-stars-container">
  <StarFull />
  <StarFull />
  <StarFull />
  <StarHalf />
  <StarEmpty />
</div>
    )
}

export default MovieStars