---
title: Sobre
description: |
  Doces Crianças: Escola infantil em São Paulo com 30 anos de história. Ensino que acolhe e respeita as cem linguagens da criança e o desenvolvimento socioemocional.
layout: :theme/page
---

# Sobre a Doces Crianças

Escola Especializada na primeira infância.
Que respeita as cem linguagens da criança!
⚜️30 anos de História


## Equipe

<div class="Docentes">
  <!-- authors.yml is in the data/ -->
  {#for id in cdi:authors.fields}
    {#let author=cdi:authors.get(id)}
    <!-- the author-card tag is defined in the default Roq theme -->
    {#author-card name=author.name avatar=author.avatar nickname=author.nickname profile=author.profile /}
  {/for}
</div>

