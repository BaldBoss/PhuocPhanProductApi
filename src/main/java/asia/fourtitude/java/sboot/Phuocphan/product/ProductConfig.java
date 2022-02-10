package asia.fourtitude.java.sboot.Phuocphan.product;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProductRespository repsitory) {
        return args -> {
            Product p001 = new Product(
                    "P001",
                    "MASK ADULT Surgical 3 ply 50'S MEDICOS with box",
                    "Health Accessories",
                    "Medicos",
                    "Hygiene",
                    "Colour: Blue (ear loop outside, ear loop inside- random assigned), Green, Purple, White, Lime Green, Yellow, Pink");
            Product p002 = new Product(
                    "P002",
                    "Party Cosplay Player Unknown Battlegrounds Clothes Hallowmas PUBG",
                    "Men's Clothing",
                    "No Brand",
                    null,
                    "Suitable for adults and children");
            Product p004 = new Product(
                    "P004",
                    "Naelofar Sofis - Printed Square",
                    "Hijab",
                    "Naelofar",
                    "Multi Colour Floral",
                    "Ornate Iris flower composition with intricate growing foliage");
            Product p005 = new Product(
                    "P005",
                    "Philips HR2051 / HR2056 / HR2059 Ice Crushing Blender Jar Mill",
                    "Small Kitchen Appliances",
                    "Philips",
                    "Mixers & Blenders",
                    "Philips HR2051 Blender (350W, 1.25L Plastic Jar, 4 stars stainless steel blade)");
            Product p006 = new Product(
                    "P006",
                    "Gemei GM-6005 Rechargeable Trimmer Hair Cutter Machine",
                    "Hair Styling Tools",
                    "Gemei",
                    "Trimmer",
                    "The GEMEI hair clipper is intended for professional use.");
            Product p007 = new Product(
                    "P007",
                    "Oreo Crumb Small Crushed Cookie Pieces 454g",
                    "Snacks",
                    "Oreo",
                    "Biscuits & Cookies",
                    "Oreo Crumb Small Crushed Cookie Pieces 454g - Retail & Wholesale New Stock Long Expiry!!!");
            Product p008 = new Product(
                    "P008",
                    "Non-contact Infrared Forehead Thermometer ABS",
                    "Kids Health & Skincare",
                    "No Brand",
                    null,
                    "Non-contact Infrared Forehead Thermometer ABS for Adults and Children with LCD Display Digital");
            Product p009 = new Product(
                    "P009",
                    "Nordic Marble Starry Sky Bedding Sets",
                    "Bedding",
                    "No Brand",
                    "Bedding Sheets",
                    "Printing process: reactive printing. Package：quilt cover ,bed sheet ,pillow case. Not include comforter or quilt.");
            Product p010 = new Product(
                    "P010",
                    "Samsung Galaxy Tab A 10.1",
                    "Mobile & Gadgets",
                    "Samsung",
                    "Tablets",
                    "4GB RAM. - 64GB ROM. - 1.5 ghz Processor. - 10.1 inches LCD Display");
            Product p003 = new Product(
                    "P003",
                    "Xiaomi REDMI 8A Official Global Version 5000 mAh battery champion 31 days 2GB+32GB",
                    "Mobile & Gadgets",
                    "Xiaomi",
                    "Mobile Phones",
                    "Colour: Xiaomi Redmi 8A");
            Product p011 = new Product(
                    "P011",
                    "REALME 5 PRO 6+128GB",
                    "Mobile & Gadgets",
                    "Realme",
                    "Mobile Phones",
                    "REALME 5 PRO 6+128GB");
            Product p012 = new Product(
                    "P012",
                    "Nokia 2.3 - Cyan Green",
                    "Mobile & Gadgets",
                    "Nokia",
                    "Mobile Phones",
                    "Nokia smartphones get 2 years of software upgrades and 3 years of monthly security updates.");
            Product p013 = new Product(
                    "P013",
                    "AKEMI Cotton Select Fitted Bedsheet Set - Adore 730TC",
                    "Bedding",
                    "Akemi",
                    "Bedding Sheets",
                    "100% Cotton Twill. Super Single.");
            Product p014 = new Product(
                    "P014",
                    "Samsung Note10+ Phone",
                    "Mobile & Gadgets",
                    "OEM",
                    "Mobile Phones",
                    "OEM Phone Models");
            Product p015 = new Product(
                    "P015",
                    "Keknis Basic Wide Long Shawl",
                    "Hijab",
                    "No Brand",
                    "Plain Shawl",
                    "1.8m × 0.7m (+/-). Heavy chiffon (120 gsm).");

            repsitory.saveAll(
                    List.of(p001, p002, p003, p004, p005, p006, p007, p008, p009, p010, p011, p012, p013, p014, p015));
        };
    }
}