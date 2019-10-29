/**
 */
package Competition.impl;

import Competition.CompetitionPackage;
import Competition.Person;
import Competition.Team;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Competition.impl.TeamImpl#getId <em>Id</em>}</li>
 *   <li>{@link Competition.impl.TeamImpl#getName <em>Name</em>}</li>
 *   <li>{@link Competition.impl.TeamImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link Competition.impl.TeamImpl#getTla <em>Tla</em>}</li>
 *   <li>{@link Competition.impl.TeamImpl#getFounded <em>Founded</em>}</li>
 *   <li>{@link Competition.impl.TeamImpl#getClubColors <em>Club Colors</em>}</li>
 *   <li>{@link Competition.impl.TeamImpl#getSquad <em>Squad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamImpl extends MinimalEObjectImpl.Container implements Team {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTla() <em>Tla</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTla()
	 * @generated
	 * @ordered
	 */
	protected static final String TLA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTla() <em>Tla</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTla()
	 * @generated
	 * @ordered
	 */
	protected String tla = TLA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFounded() <em>Founded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFounded()
	 * @generated
	 * @ordered
	 */
	protected static final int FOUNDED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFounded() <em>Founded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFounded()
	 * @generated
	 * @ordered
	 */
	protected int founded = FOUNDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getClubColors() <em>Club Colors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClubColors()
	 * @generated
	 * @ordered
	 */
	protected static final String CLUB_COLORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClubColors() <em>Club Colors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClubColors()
	 * @generated
	 * @ordered
	 */
	protected String clubColors = CLUB_COLORS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSquad() <em>Squad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSquad()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> squad;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompetitionPackage.Literals.TEAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.TEAM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.TEAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.TEAM__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTla() {
		return tla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTla(String newTla) {
		String oldTla = tla;
		tla = newTla;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.TEAM__TLA, oldTla, tla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFounded() {
		return founded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFounded(int newFounded) {
		int oldFounded = founded;
		founded = newFounded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.TEAM__FOUNDED, oldFounded, founded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClubColors() {
		return clubColors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClubColors(String newClubColors) {
		String oldClubColors = clubColors;
		clubColors = newClubColors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.TEAM__CLUB_COLORS, oldClubColors, clubColors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getSquad() {
		if (squad == null) {
			squad = new EObjectContainmentEList<Person>(Person.class, this, CompetitionPackage.TEAM__SQUAD);
		}
		return squad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompetitionPackage.TEAM__SQUAD:
				return ((InternalEList<?>)getSquad()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompetitionPackage.TEAM__ID:
				return getId();
			case CompetitionPackage.TEAM__NAME:
				return getName();
			case CompetitionPackage.TEAM__SHORT_NAME:
				return getShortName();
			case CompetitionPackage.TEAM__TLA:
				return getTla();
			case CompetitionPackage.TEAM__FOUNDED:
				return getFounded();
			case CompetitionPackage.TEAM__CLUB_COLORS:
				return getClubColors();
			case CompetitionPackage.TEAM__SQUAD:
				return getSquad();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CompetitionPackage.TEAM__ID:
				setId((Integer)newValue);
				return;
			case CompetitionPackage.TEAM__NAME:
				setName((String)newValue);
				return;
			case CompetitionPackage.TEAM__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case CompetitionPackage.TEAM__TLA:
				setTla((String)newValue);
				return;
			case CompetitionPackage.TEAM__FOUNDED:
				setFounded((Integer)newValue);
				return;
			case CompetitionPackage.TEAM__CLUB_COLORS:
				setClubColors((String)newValue);
				return;
			case CompetitionPackage.TEAM__SQUAD:
				getSquad().clear();
				getSquad().addAll((Collection<? extends Person>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CompetitionPackage.TEAM__ID:
				setId(ID_EDEFAULT);
				return;
			case CompetitionPackage.TEAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CompetitionPackage.TEAM__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case CompetitionPackage.TEAM__TLA:
				setTla(TLA_EDEFAULT);
				return;
			case CompetitionPackage.TEAM__FOUNDED:
				setFounded(FOUNDED_EDEFAULT);
				return;
			case CompetitionPackage.TEAM__CLUB_COLORS:
				setClubColors(CLUB_COLORS_EDEFAULT);
				return;
			case CompetitionPackage.TEAM__SQUAD:
				getSquad().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CompetitionPackage.TEAM__ID:
				return id != ID_EDEFAULT;
			case CompetitionPackage.TEAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CompetitionPackage.TEAM__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case CompetitionPackage.TEAM__TLA:
				return TLA_EDEFAULT == null ? tla != null : !TLA_EDEFAULT.equals(tla);
			case CompetitionPackage.TEAM__FOUNDED:
				return founded != FOUNDED_EDEFAULT;
			case CompetitionPackage.TEAM__CLUB_COLORS:
				return CLUB_COLORS_EDEFAULT == null ? clubColors != null : !CLUB_COLORS_EDEFAULT.equals(clubColors);
			case CompetitionPackage.TEAM__SQUAD:
				return squad != null && !squad.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(", tla: ");
		result.append(tla);
		result.append(", founded: ");
		result.append(founded);
		result.append(", clubColors: ");
		result.append(clubColors);
		result.append(')');
		return result.toString();
	}

} //TeamImpl
