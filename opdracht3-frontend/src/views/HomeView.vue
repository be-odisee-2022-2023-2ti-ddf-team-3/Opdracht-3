<template>
  <main>
    <h1>personen</h1>
    <table>
      <tr>
        <th>id</th>
        <th>naam</th>
        <th>email</th>
        <th>paswoord</th>
        <th>rol</th>
        <th>acties</th>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
    </table>
  </main>
</template>
<script>
export default {
  props: {
    msg: String
  },

  methods: {
    fetchData() {
      fetch('https://localhost/8080/personen', {
        method: 'GET',
        headers: {
          'x-rapidapi-host': 'random-facts2.p.rapidapi.com',
          'x-rapidapi-key': 'Your -RapidAPI-Hub-Key'
        }
      })
        .then(response => {
          response.json().then(res => console.log(res));
        })
        .catch(err => {
          console.error(err);
        });
    }
  },
  beforeMount() {
    this.fetchData()
  }
};
</script>