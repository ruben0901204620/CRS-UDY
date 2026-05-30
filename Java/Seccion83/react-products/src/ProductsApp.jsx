import PropTypes from 'prop-types'
import { useState } from 'react'
import { ProductTable } from './components/ProductTable'

const initProducts = [{
    id: 1,
    name: "Monitor Asus",
    description: "El monitor es perfecto para jeugos",
    price: 1000
},
{
    id: 2,
    name: "Iphone 17 pro max",
    description: "El telefono es exelente e incluye Apple Intelligence!",
    price: 1000
}];

export const ProductsApp = ({title = 'Titulo por defecto'}) => {

    const [products, setProducts] = useState(initProducts);

    return <div className='container my-4'>
        <h2>{title}</h2>
        <div className='row'> 
            <div className='col'>
                <ProductTable products={ products }/>
            </div>
        </div>

    </div>

}

ProductsApp.propTypes = {
    title: PropTypes.string.isRequired
}
