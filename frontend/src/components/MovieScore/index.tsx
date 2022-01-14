import MovieStars from "components/MovieStars";
import './stile.css'


function MovieScore() {

    const score = 3.0
    const count = 4
    return (
        <div className="dsmovie-score-container">
            <p className="dsmovie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <MovieStars />
            <p className="dsmovie-score-count">{count} avaliações</p>
        </div>

    )

}

export default MovieScore