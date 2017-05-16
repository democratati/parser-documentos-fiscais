# Parser Documentos Fiscais

Ferramenta útil para ler documentos fiscais em XML e converte-lo em uma entidade abstrata.

### Documentos fiscais

- [MDF-e] - Manifesto Eletrônico de Documentos Fiscais

## Ferramentas

Utilizado [JAX-B] para transformar os arquivos de esquemas XML's (XSD) em classes Java. 

## Schemas

| Documento | Data | Versão | Site |
| --------- | ---- | ------ | ---- |
| MDF-e | 30/03/2017 | 3.00 | aqui(https://mdfe-portal.sefaz.rs.gov.br/Site/Documentos) | 


### Exportar XSD do documento para classes Java

```sh
$ xjc -encoding UTF-8  raw/xsd/PL_MDFe_300/procMDFe_v3.00.xsd raw/xsd/PL_MDFe_300/mdfeTiposBasico_v3.00.xsd raw/xsd/PL_MDFe_ 300/consReciMDFeTiposBasico_v3.00.xsd -d src -p com.github.wagnerfonseca.quickparser.model.mdfe
```


[//]: #

   [MDF-e]: <https://www.fazenda.sp.gov.br/mdfe/>
   [JAX-B]: <https://docs.oracle.com/javase/tutorial/jaxb/intro/>