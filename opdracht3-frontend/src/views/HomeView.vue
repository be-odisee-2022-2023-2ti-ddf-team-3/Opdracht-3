<template>
  <main>
    <div class="container">
      <div class="card">
        <div class="card_head">
          <h2>personen</h2>
          <button class="button add_button">add persoon</button>
        </div>
        <table class="styled-table">
          <thead>
            <tr>
              <!-- <th>id</th> -->
              <th>naam</th>
              <th>email</th>
              <!-- <th>paswoord</th> -->
              <!-- <th>rol</th> -->
              <!-- <th>acties</th> -->
            </tr>
          </thead>
          <tbody>
            <tr v-for="person in persons" @click="detailPerson(person)" :key="person.id">
              <!-- <td>{{ person.id }}</td> -->
              <!-- <router-link :to="{path: '/persoon/'+person.id}"> -->
              <td>{{ person.voornaam }} {{ person.familienaam }}</td>
              <td>{{ person.emailadres }}</td>
              <!-- </router-link>  -->

              <!-- <td>{{ person.paswoord }}</td> -->
              <!-- <td>{{ person.rol }}</td> -->
              <!-- <td>Display actions for the person here</td> -->
            </tr>
          </tbody>
        </table>
      </div>
      <div class="card">
        <div class="card_head">
          <h2>demo's</h2>
          <button class="button add_button">add demo</button>
        </div>
        <table class="styled-table">
          <thead>
            <tr>
              <!-- <th>id</th> -->
              <th>naam</th>
              <th>adres</th>
              <th>status</th>
              <th>acties</th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="demo in demos" @click="detailDemo(demo)" :key="demo.id">
              <!-- <td>{{ demo.id }}</td> -->
              <td>{{ demo.naam }}</td>
              <td>{{ demo.adres }}</td>
              <td>{{ demo.status }}</td>
              <td><!-- Display actions for the person here --></td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </main>
</template>
<script>
import axios from "axios";
import router from "../router";
export default {
  data() {
    return {
      persons: [
        {
          "id": 1,
          "voornaam": "Thomas",
          "familienaam": "Roelandts",
          "emailadres": "roelandts.th@gmail.com",
          "paswoord": "geheim",
          "rol": "Admin"
        }
      ],
      demos: [
        {
          "id": 1,
          "naam": "Odisee Demo",
          "adres": "Stormstraat 2, 1000 Brussel",
          "status": "aangemaakt"
        },
        {
          "id": 2,
          "naam": "Odisee Demo",
          "adres": "Stormstraat 2, 1000 Brussel",
          "status": "aangemaakt"
        },
        {
          "id": 3,
          "naam": "Odisee Demo",
          "adres": "Stormstraat 2, 1000 Brussel",
          "status": "aangemaakt"
        },
        {
          "id": 4,
          "naam": "Odisee Demo",
          "adres": "Stormstraat 2, 1000 Brussel",
          "status": "aangemaakt"
        }
      ]
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
    },
    fetchDemos() {
      axios
        .get("http://localhost:9081/demos")
        .then(response => {
          const result = response.data;
          const persons = result._embedded.persoons;
          this.persons = persons;
        })
        .catch(error => {
          console.error(error);
        });
    },
    detailPerson(person) {
      router.push('/persoon/' + person.id)
    },
    detailDemo(demo) {
      router.push('/demo/' + demo.id)
    }
  }
}
</script>
<style scoped>
.container {
  display: flex;
  justify-content: space-around;
  flex-wrap: wrap;
}

.card_head {
  display: flex;
  justify-content: space-between;
}

.styled-table {
  border-collapse: collapse;
  margin: 25px 0;
  font-size: 0.9em;
  font-family: sans-serif;
  min-width: 400px;
  box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
  overflow: hidden;
  border-radius: 10px;
}

.styled-table thead tr {
  background-color: #009879;
  color: #ffffff;
  text-align: left;
}

.styled-table th,
.styled-table td {
  padding: 12px 15px;
}

.styled-table tbody tr {
  border-bottom: 1px solid #dddddd;
}

.styled-table tbody tr:nth-of-type(even) {
  background-color: #f3f3f3;
}

.styled-table tbody tr:hover,
.styled-table tbody tr:nth-of-type(even):hover {
  background-color: #d0d0d0;
  cursor: pointer;
}

.styled-table tbody tr.active-row {
  font-weight: bold;
  color: #009879;
}

.add_button {
  background-color: #44d75f;
  color: #fff;

}

.button {
  padding: 0px 8px;
  border: none;
  border-radius: 4px;
}
</style>