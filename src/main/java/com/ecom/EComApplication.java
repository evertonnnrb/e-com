package com.ecom;

import com.ecom.domain.*;
import com.ecom.domain.enuns.TipoCliente;
import com.ecom.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class EComApplication implements CommandLineRunner {

    @Autowired
    private EstadoRepository estadoRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    EnderecoRepository enderecoRepository;

    public static void main(String[] args) {
        SpringApplication.run(EComApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Categoria categoria1 = new Categoria();
        categoria1.setNome("Informatica");
        Categoria categoria2 = new Categoria();
        categoria2.setNome("Escritorio");

        Produto mouse = new Produto();
        mouse.setNome("Mouse");
        mouse.setValor(new BigDecimal(90.0));

        Produto monitor = new Produto();
        monitor.setNome("Monitor Samsung");
        monitor.setValor(new BigDecimal(590.0));

        Produto cadeira = new Produto();
        cadeira.setNome("Key board");
        cadeira.setValor(new BigDecimal(190.0));

        categoria1.getProdutos().addAll(Arrays.asList(mouse, monitor));
        categoria2.getProdutos().addAll(Arrays.asList(cadeira));

        mouse.getCategorias().add(categoria1);
        monitor.getCategorias().add(categoria1);
        cadeira.getCategorias().add(categoria2);

        Estado ms = new Estado("Mato grosso do sul", "MS");
        Estado mt = new Estado("Mato grosso", "MT");

        Cidade campoGrande = new Cidade("Campo Grande", "CG", ms);
        Cidade dourados = new Cidade("Dourados", "dr", ms);

        Cidade cuiaba = new Cidade("Cuiaba", "Cu", mt);
        Cidade sinopi = new Cidade("Sinopi", "Si", mt);

        Cliente jao = new Cliente("Jão da Silvar","jao@gmail.com","123123123"
                , TipoCliente.PESSOA_FISICA);
        Cliente maria = new Cliente("Maria Ruana","maria@gmail.com","2134123434",
                TipoCliente.PESSOA_JURIDICA);

        jao.getTelefones().addAll(Arrays.asList("99999000","999938333"));
        maria.getTelefones().addAll(Arrays.asList("99888998","3939393"));

        Endereco stJustinha = new Endereco("Rua da paz","30","none"
                ,"St Justinha","00009",jao,campoGrande);

        Endereco nsSrGraca = new Endereco("Rua suja","899","sobreado em frente a escola",
                "Nossa sr da graça","9292029922",maria,dourados);

        jao.getEnderecos().add(stJustinha);
        maria.getEnderecos().add(nsSrGraca);

        ms.getCidades().addAll(Arrays.asList(campoGrande, dourados));
        mt.getCidades().addAll(Arrays.asList(cuiaba, sinopi));


        estadoRepository.saveAll(Arrays.asList(ms,mt));
        cidadeRepository.saveAll(Arrays.asList(campoGrande,dourados,sinopi,cuiaba));

        categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2));
        produtoRepository.saveAll(Arrays.asList(mouse, monitor, cadeira));

        clienteRepository.saveAll(Arrays.asList(maria,jao));
        enderecoRepository.saveAll(Arrays.asList(stJustinha,nsSrGraca));

    }
}
