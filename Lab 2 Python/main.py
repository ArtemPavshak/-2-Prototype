import copy

class MovieTicket:
    def __init__(self, movie_name, theater_name, show_time, price):
        self.movie_name = movie_name
        self.theater_name = theater_name
        self.show_time = show_time
        self.price = price

    def clone(self):
        return copy.deepcopy(self)

    def __str__(self):
        return f"MovieTicket{{movie_name='{self.movie_name}', theater_name='{self.theater_name}', show_time='{self.show_time}', price={self.price}}}"

class TicketRegistry:
    def __init__(self):
        self.ticket_prototypes = {}

    def add_ticket_prototype(self, key, ticket):
        self.ticket_prototypes[key] = ticket

    def get_ticket_clone(self, key):
        ticket = self.ticket_prototypes.get(key)
        if ticket is not None:
            return ticket.clone()
        return None

if __name__ == "__main__":
    standard_ticket = MovieTicket("Пірати карибського моря", "Кінотеатр Чернівці", "18:30", 200)
    vip_ticket = MovieTicket("Персі Джексон", "Кінотеатр Кобилянської", "20:00", 350)

    ticket_registry = TicketRegistry()
    ticket_registry.add_ticket_prototype("standard", standard_ticket)
    ticket_registry.add_ticket_prototype("vip", vip_ticket)

    cloned_ticket1 = ticket_registry.get_ticket_clone("standard")
    cloned_ticket2 = ticket_registry.get_ticket_clone("vip")

    print("Cloned Ticket 1:", cloned_ticket1)
    print("Cloned Ticket 2:", cloned_ticket2)
