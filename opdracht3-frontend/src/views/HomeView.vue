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
      <tr v-for="person in persons" :key="person.id">
        <td>{{ person.id }}</td>
        <td>{{ person.voornaam }} {{ person.familienaam }}</td>
        <td>{{ person.emailadres }}</td>
        <td>{{ person.paswoord }}</td>
        <td><!-- Display person's role here --></td>
        <td><!-- Display actions for the person here --></td>
      </tr>
    </table>
  </main>
</template>
<script>
import axios from "axios";

export default {
  data() {
    return {
      persons: []
    };
  },
  created() {
    this.fetchPersons();
  },
  methods: {
    fetchPersons() {
      axios
        .get("http://localhost:9081/persoons")
        .then(response => {
          const result = response.data;
          const persons = result._embedded.persoons;
          this.persons = persons;
        })
        .catch(error => {
          console.error(error);
        });
    }
  }
}
</script>
