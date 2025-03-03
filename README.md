# 📋 Processo Seletivo - Simulação de Seleção de Candidatos

Bem-vindo ao projeto **Processo Seletivo**! 🚀 Este programa em Java simula um processo de seleção de candidatos para uma vaga de emprego, considerando o salário pretendido pelos candidatos e a interação com tentativas de contato. O código é ideal para entender conceitos básicos de programação, como loops, condicionais e interação com o usuário. 💻✨

---

## 🌟 Funcionalidades do Sistema

✅ **Cadastro de Candidatos**: Uma lista pré-definida de candidatos é utilizada para simular o processo seletivo.  
🔍 **Análise de Salário Pretendido**: O sistema compara o salário base da vaga com o valor solicitado pelo candidato.  
📞 **Tentativas de Contato**: Simula ligações para os candidatos selecionados, com até 3 tentativas de contato.  
🎯 **Resultados Automatizados**: Exibe os candidatos selecionados e o status das tentativas de contato.

---

## 🛠️ Como Funciona?

1. **Entrada de Dados**: O usuário informa o salário pretendido pelo candidato.  
2. **Seleção de Candidatos**: O sistema avalia cada candidato e verifica se o salário pretendido é compatível com o salário base da vaga.  
3. **Contato com Candidatos**: Caso o candidato seja selecionado, o sistema tenta realizar contato (simulado aleatoriamente).  
4. **Resultados Finais**: Exibe os candidatos selecionados e o status das tentativas de contato.

---

## 📋 Código Explicado

### Estrutura Principal
- **Lista de Candidatos**: Um array contém os nomes dos candidatos pré-cadastrados.
- **Salário Base**: O valor fixo da vaga é comparado com o salário pretendido pelo candidato.
- **Tentativas de Contato**: Utiliza um gerador de números aleatórios para simular se o candidato atendeu ou não à ligação.

### Fluxo do Programa
1. O usuário informa o salário pretendido.
2. O sistema percorre a lista de candidatos e verifica se o salário pretendido é menor ou igual ao salário base.
3. Os candidatos selecionados são exibidos com seus índices na lista.
4. O sistema tenta entrar em contato com o último candidato selecionado, realizando até 3 tentativas.

---

## 🎯 Exemplo de Saída

```plaintext
Digite o valor pretendido: 
2000
O candidato FELIPE solicitou este valor de salário 2000.0
O candidato FELIPE foi selecionado para a vaga
O candidato MARCIA solicitou este valor de salário 2000.0
O candidato MARCIA foi selecionado para a vaga
...
Imprimindo a lista de selecionados informando o índice do elemento:
O candidato de nº 0 é FELIPE
O candidato de nº 1 é MARCIA
LIGAR PARA O CANDIDATO COM UMA CONTRA PROPOSTA
CONTATO REALIZADO COM SUCESSO
CONSEGUIMOS CONTATO COM MARCIA NA 2ª TENTATIVA
```

---

## 📞 Contato

Para dúvidas, sugestões ou feedbacks, entre em contato:  
📧 E-mail: arthurjose.pn01@gmail.com 
🌐 LinkedIn: [seu-perfil-linkedin](https://www.linkedin.com/in/arthur-js)  
