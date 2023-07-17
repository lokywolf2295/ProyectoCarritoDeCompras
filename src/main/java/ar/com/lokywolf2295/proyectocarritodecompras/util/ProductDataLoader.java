package ar.com.lokywolf2295.proyectocarritodecompras.util;

import ar.com.lokywolf2295.proyectocarritodecompras.model.dto.request.ProductRequestDTO;
import ar.com.lokywolf2295.proyectocarritodecompras.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductDataLoader implements CommandLineRunner {
    
    private final IProductService productService;

    @Override
    public void run(String... args) throws Exception {
        loadPersonData();
    }


    private void loadPersonData() {
        if(productService.getAllProducts(0).isEmpty()){
            ProductRequestDTO product1 = new ProductRequestDTO(
                    "Coca Cola",
                    "Bebida",
                    "Gaseosa de la marca Coca Cola",
                    100,
                    1000,
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/15-09-26-RalfR-WLC-0098_-_Coca-Cola_glass_bottle_%28Germany%29.jpg/320px-15-09-26-RalfR-WLC-0098_-_Coca-Cola_glass_bottle_%28Germany%29.jpg"
            );
            ProductRequestDTO product2 = new ProductRequestDTO(
                    "Sprite",
                    "Bebida",
                    "Gaseosa de la marca Sprite",
                    100,
                    1000,
                    "https://labebidadetusfiestas.com.ar/46004/sprite-limonada-descartable-1500cc.jpg"
            );
            ProductRequestDTO product3 = new ProductRequestDTO(
                    "Fanta",
                    "Bebida",
                    "Gaseosa de la marca Fanta",
                    100,
                    1000,
                    "https://carrefourar.vtexassets.com/arquivos/ids/332333/7790895000331_E02.jpg?v=638211437932930000"
            );
            ProductRequestDTO product4 = new ProductRequestDTO(
                    "Té Dharamsala",
                    "Bebidas",
                    "Té Dharamsala",
                    18,
                    20,
                    "https://thumbs.dreamstime.com/b/t%C3%A9-de-masala-en-dharamsala-135261454.jpg"
            );
            ProductRequestDTO product5 = new ProductRequestDTO(
                    "Cerveza Patagonia",
                    "Bebidas",
                    "Cerveza de marca Patagonia",
                    100,
                    1000,
                    "https://gobar.vtexassets.com/arquivos/ids/157558/PATAGONIA-BOHEMIAN-PILSENER-BOTELLA-710.jpg?v=637235191247800000"
            );
            ProductRequestDTO product6 = new ProductRequestDTO(
                    "Papas Fritas",
                    "Snacks",
                    "Papas fritas de la marca Lays",
                    100,
                    1000,
                    "https://d1on8qs0xdu5jz.cloudfront.net/webapp/images/fotos/b/0000000030/2678_1.jpg"
            );
            ProductRequestDTO product7 = new ProductRequestDTO(
                    "Mermerlada de frutilla",
                    "Dulces",
                    "Mermerlada de la marca Arcor",
                    100,
                    1000,
                    "https://ardiaprod.vtexassets.com/arquivos/ids/249117/Mermelada-Tradicional-Arcor-Frutilla-454-Gr-_1.jpg?v=638181571653430000"
            );
            ProductRequestDTO product8 = new ProductRequestDTO(
                    "Galletitas Oreo",
                    "Galletitas",
                    "Galletitas de la marca Oreo",
                    100,
                    1000,
                    "https://ardiaprod.vtexassets.com/arquivos/ids/256105/Galletitas-Rellenas-Oreo-Original-354-Gr-_1.jpg?v=638243399825000000"
            );
            ProductRequestDTO product9 = new ProductRequestDTO(
                    "Galletitas Pepitos",
                    "Galletitas",
                    "Galletitas de la marca Pepitos",
                    100,
                    1000,
                    "https://d3ugyf2ht6aenh.cloudfront.net/stores/001/160/839/products/011-001-006_galletitas-pepitos-x118gr-clasica1-2d7684f3a788af1b1c15885077764983-1024-1024.jpg"
            );
            ProductRequestDTO product10 = new ProductRequestDTO(
                    "Queso cremoso",
                    "Lacteos",
                    "Queso cremoso de la marca Punta del Agua",
                    100,
                    1000,
                    "https://static.cotodigital3.com.ar/sitios/fotos/full/00000100/00000161.jpg?3.0.157c"
            );
            ProductRequestDTO product11 = new ProductRequestDTO(
                    "Queso untable",
                    "Lacteos",
                    "Queso untable de la marca Sancor",
                    100,
                    1000,
                    "https://tienda.elgranel.com.ar/wp-content/uploads/2021/08/WhatsApp-Image-2021-08-31-at-08.23.19.jpeg"
            );
            ProductRequestDTO product12 = new ProductRequestDTO(
                    "Leche",
                    "Lacteos",
                    "Leche de la marca La Serenisima",
                    100,
                    1000,
                    "https://www.laserenisima.com.ar/images/productos/Leche-LS-Bien-Animal-3-sachet-ok.png"
            );
            ProductRequestDTO product13 = new ProductRequestDTO(
                    "Harina",
                    "Panificados",
                    "Harina de la marca Pureza",
                    100,
                    1000,
                    "https://d3ugyf2ht6aenh.cloudfront.net/stores/001/160/839/products/002-012-010_harina-pureza-x-1-kg-00001-90489f50e06476be0415883622489618-1024-1024.jpg"
            );
            ProductRequestDTO product14 = new ProductRequestDTO(
                    "Pan lactal",
                    "Panificados",
                    "Pan lactal de la marca Bimbo",
                    100,
                    1000,
                    "https://masonlineprod.vtexassets.com/arquivos/ids/260474/Pan-Bimbo-Lactal-Liviano-Grande-550g-2-5869.jpg?v=638016393958600000"
            );

            productService.createProduct(product1);
            productService.createProduct(product2);
            productService.createProduct(product3);
            productService.createProduct(product4);
            productService.createProduct(product5);
            productService.createProduct(product6);
            productService.createProduct(product7);
            productService.createProduct(product8);
            productService.createProduct(product9);
            productService.createProduct(product10);
            productService.createProduct(product11);
            productService.createProduct(product12);
            productService.createProduct(product13);
            productService.createProduct(product14);
        }
    }
}