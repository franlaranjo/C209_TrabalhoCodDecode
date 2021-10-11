# COMPUTAÇÃO GRÁFICA E MULTIMÍDIA - LAB

- [Sobre](#-sobre)
- [Como executar](#-como-executar)
- [Exemplos](#-exemplos)


## 💻 Sobre

Trabalho de C209-L2, utilizando Codificação e Decodificação de Arquivos por meio do BASE64.  

---

## 🚀 Como executar

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:

- [IntelliJ](https://www.jetbrains.com/pt-br/idea/download/#section=windows)

### Clonando repositório

Para clonar o repositório em algum lugar na sua máquina, basta utilizar o comando abaixo:
```bash
$ git clone https://github.com/franlaranjo/C209_TrabalhoCodDecode.git
```

## Exemplos
Execute cada um dos exemplos, individualmente, para visualizar o código em Base64 e valide sua decodificação no diretório (src/main/resources)

Caso queira validar a codificação e a decodificação, utilize o site [Base64Guru](https://base64.guru/).

### MP3
- public static void main(String[] args) throws URISyntaxException → Path caminho = Paths.get(ClassLoader.getSystemResource("Sandy_Com-Voce-sempre.mp3").toURI());
- private static void decodedBase64StringtoFile(String encodedfile) → FileOutputStream outputStream = new FileOutputStream("src/main/resources/tmp.mp3");

### PNG
- public static void main(String[] args) throws URISyntaxException → Path caminho = Paths.get(ClassLoader.getSystemResource("C209l2.png").toURI());
- private static void decodedBase64StringtoFile(String encodedfile) → FileOutputStream outputStream = new FileOutputStream("src/main/resources/tmp.png");

### JPG
- public static void main(String[] args) throws URISyntaxException → Path caminho = Paths.get(ClassLoader.getSystemResource("Sandy-e-Junior.jpg").toURI());
- private static void decodedBase64StringtoFile(String encodedfile) → FileOutputStream outputStream = new FileOutputStream("src/main/resources/tmp.jpg");
