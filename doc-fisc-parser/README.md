# DocFiscParser

## Como Utilizar

```
<dependency>
  <groupId>com.github.democratati</groupId>
  <artifactId>doc-fisc-parser</artifactId>
  <version>1.0.0</version>
</dependency>
```


### Exportar XSD do documento para classes Java

```sh
$ xjc -encoding UTF-8  ../raw/xsd/PL_MDFe_300/procMDFe_v3.00.xsd ../raw/xsd/PL_MDFe_300/mdfeTiposBasico_v3.00.xsd ../raw/x sd/PL_MDFe_300/consReciMDFeTiposBasico_v3.00.xsd -d src -p com.github.wagnerfonseca.docfiscparser.model.mdfe
```
