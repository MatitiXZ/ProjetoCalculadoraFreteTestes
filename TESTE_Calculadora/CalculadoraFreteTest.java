import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraFreteTest {

    // Cenário 1: Valor da compra < R$70
    @Test void testeCenario1_Compra50_Dist5() { 
        assertEquals(12.5, CalculadoraFrete.calcularFrete(50, 5)); 
        }

    @Test void testeCenario1_Compra52_Dist6() { 
        assertEquals(13.0, CalculadoraFrete.calcularFrete(52, 6)); 
        }

    @Test void testeCenario1_Compra54_Dist7() { 
        assertEquals(13.5, CalculadoraFrete.calcularFrete(54, 7)); 
        }

    @Test void testeCenario1_Compra56_Dist8() { 
        assertEquals(14.0, CalculadoraFrete.calcularFrete(56, 8)); 
        }

    @Test void testeCenario1_Compra58_Dist9() { 
        assertEquals(14.5, CalculadoraFrete.calcularFrete(58, 9)); 
        }

    @Test void testeCenario1_Compra60_Dist10() { 
        assertEquals(15.0, CalculadoraFrete.calcularFrete(60, 10)); 
        }
        
    @Test void testeCenario1_Compra62_Dist11() { 
        assertEquals(15.5, CalculadoraFrete.calcularFrete(62, 11)); 
        }

    @Test void testeCenario1_Compra64_Dist12() { 
        assertEquals(16.0, CalculadoraFrete.calcularFrete(64, 12)); 
        }

    @Test void testeCenario1_Compra66_Dist13() { 
        assertEquals(16.5, CalculadoraFrete.calcularFrete(66, 13)); 
        }

    @Test void testeCenario1_Compra68_Dist14() { 
        assertEquals(17.0, CalculadoraFrete.calcularFrete(68, 14)); 
        }

    // Cenário 2: Compra entre R$70 e R$100 (50% de desconto)
    @Test void testeCenario2_Compra70_Dist4() { 
        assertEquals(6.0, CalculadoraFrete.calcularFrete(70, 4)); 
        }

    @Test void testeCenario2_Compra73_Dist5() { 
        assertEquals(6.25, CalculadoraFrete.calcularFrete(73, 5)); 
        }

    @Test void testeCenario2_Compra76_Dist6() { 
        assertEquals(6.5, CalculadoraFrete.calcularFrete(76, 6)); 
        }

    @Test void testeCenario2_Compra79_Dist7() { 
        assertEquals(6.75, CalculadoraFrete.calcularFrete(79, 7)); 
        }

    @Test void testeCenario2_Compra82_Dist8() { 
        assertEquals(7.0, CalculadoraFrete.calcularFrete(82, 8)); 
        }

    @Test void testeCenario2_Compra85_Dist9() { 
        assertEquals(7.25, CalculadoraFrete.calcularFrete(85, 9)); 
        }

    @Test void testeCenario2_Compra88_Dist10() { 
        assertEquals(7.5, CalculadoraFrete.calcularFrete(88, 10)); 
        }

    @Test void testeCenario2_Compra91_Dist11() { 
        assertEquals(7.75, CalculadoraFrete.calcularFrete(91, 11)); 
        }

    @Test void testeCenario2_Compra94_Dist12() { 
        assertEquals(8.0, CalculadoraFrete.calcularFrete(94, 12)); 
        }
        
    @Test void testeCenario2_Compra97_Dist13() { 
        assertEquals(8.25, CalculadoraFrete.calcularFrete(97, 13)); 
        }

    // Cenário 3: Frete grátis (> R$100)
    @Test void testeCenario3_Compra110_Dist2() { 
        assertEquals(0.0, CalculadoraFrete.calcularFrete(110, 2)); 
        }

    @Test void testeCenario3_Compra120_Dist3() { 
        assertEquals(0.0, CalculadoraFrete.calcularFrete(120, 3)); 
        }

    @Test void testeCenario3_Compra130_Dist4() { 
        assertEquals(0.0, CalculadoraFrete.calcularFrete(130, 4)); 
        }

    @Test void testeCenario3_Compra140_Dist5() { 
        assertEquals(0.0, CalculadoraFrete.calcularFrete(140, 5)); 
        }

    @Test void testeCenario3_Compra150_Dist6() { 
        assertEquals(0.0, CalculadoraFrete.calcularFrete(150, 6)); 
        }

    @Test void testeCenario3_Compra160_Dist7() { 
        assertEquals(0.0, CalculadoraFrete.calcularFrete(160, 7)); 
        }

    @Test void testeCenario3_Compra170_Dist8() { 
        assertEquals(0.0, CalculadoraFrete.calcularFrete(170, 8)); 
        }

    @Test void testeCenario3_Compra180_Dist9() { 
        assertEquals(0.0, CalculadoraFrete.calcularFrete(180, 9)); 
        }

    @Test void testeCenario3_Compra190_Dist10() { 
        assertEquals(0.0, CalculadoraFrete.calcularFrete(190, 10)); 
        }

    @Test void testeCenario3_Compra200_Dist11() { 
        assertEquals(0.0, CalculadoraFrete.calcularFrete(200, 11)); 
        }

    // Cenário 4: Compra inválida (<= 0)
    @Test void testeCenario4_1_Compra0() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(0.0, 5));
        assertEquals("O valor da compra deve ser maior que zero.", e.getMessage());
    }

    @Test void testeCenario4_2_CompraMenos1() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(-1.0, 5));
        assertEquals("O valor da compra deve ser maior que zero.", e.getMessage());
    }

    @Test void testeCenario4_3_CompraMenos2() { 
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(-2.0, 5));
        assertEquals("O valor da compra deve ser maior que zero.", e.getMessage());
    }

    @Test void testeCenario4_4_CompraMenos3() { 
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(-3.0, 5));
        assertEquals("O valor da compra deve ser maior que zero.", e.getMessage());
    }

    @Test void testeCenario4_5_CompraMenos4() { 
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(-4.0, 5));
        assertEquals("O valor da compra deve ser maior que zero.", e.getMessage());
    }

    @Test void testeCenario4_6_CompraMenos5() { 
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(-5.0, 5));
        assertEquals("O valor da compra deve ser maior que zero.", e.getMessage());
    }

    @Test void testeCenario4_7_CompraMenos6() { 
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(-6.0, 5));
        assertEquals("O valor da compra deve ser maior que zero.", e.getMessage());
    }

    @Test void testeCenario4_8_CompraMenos7() { 
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(-7.0, 5));
        assertEquals("O valor da compra deve ser maior que zero.", e.getMessage());
    }

    @Test void testeCenario4_9_CompraMenos8() { 
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(-8.0, 5));
        assertEquals("O valor da compra deve ser maior que zero.", e.getMessage());
    }

    @Test void testeCenario4_10_CompraMenos9() {    
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(-9.0, 5));
        assertEquals("O valor da compra deve ser maior que zero.", e.getMessage());
    }

    //Cenário 4 resolvido com loop
    @Test void testeCenario4_Compra0() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(0, 5));
        assertEquals("O valor da compra deve ser maior que zero.", e.getMessage());
    }
    @Test void testeCenario4_CompraNegativa() {
        for (int i = 1; i <= 9; i++) {
            double valor = -i;
            Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(valor, 5));
            assertEquals("O valor da compra deve ser maior que zero.", e.getMessage());
        }
    }


    // Cenário 5: Distância inválida (< 0)
    @Test void testeCenario5_1_DistanciaMenos1() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(80.0, -1.0));
        assertEquals("A distância não pode ser negativa.", e.getMessage());
    }

    @Test void testeCenario5_2_DistanciaMenos2() {  
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(80.0, -2.0));
        assertEquals("A distância não pode ser negativa.", e.getMessage());
    }

    @Test void testeCenario5_3_DistanciaMenos3() {  
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(80.0, -3.0));
        assertEquals("A distância não pode ser negativa.", e.getMessage());
    }

    @Test void testeCenario5_4_DistanciaMenos4() {  
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(80.0, -4.0));
        assertEquals("A distância não pode ser negativa.", e.getMessage());
    }

    @Test void testeCenario5_5_DistanciaMenos5() {  
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(80.0, -5.0));
        assertEquals("A distância não pode ser negativa.", e.getMessage());
    }

    @Test void testeCenario5_6_DistanciaMenos6() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(80.0, -6.0));
        assertEquals("A distância não pode ser negativa.", e.getMessage());
    }

    @Test void testeCenario5_7_DistanciaMenos7() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(80.0, -7.0));
        assertEquals("A distância não pode ser negativa.", e.getMessage());
    }

    @Test void testeCenario5_8_DistanciaMenos8() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(80.0, -8.0));
        assertEquals("A distância não pode ser negativa.", e.getMessage());
    }

    @Test void testeCenario5_9_DistanciaMenos9() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(80.0, -9.0));
        assertEquals("A distância não pode ser negativa.", e.getMessage());
    }

    @Test void testeCenario5_10_DistanciaMenos10() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(80.0, -10.0));
        assertEquals("A distância não pode ser negativa.", e.getMessage());
    }

    
    // Cenário 5 resolvido com loop
    @Test void testeCenario5_DistanciaNegativa() {
        for (int i = 1; i <= 10; i++) {
            double distancia = -i;
            Exception e = assertThrows(IllegalArgumentException.class, () -> CalculadoraFrete.calcularFrete(80, distancia));
            assertEquals("A distância não pode ser negativa.", e.getMessage());
        }
    }
}
