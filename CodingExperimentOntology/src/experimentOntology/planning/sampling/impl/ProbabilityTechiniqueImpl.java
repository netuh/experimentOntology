/**
 */
package experimentOntology.planning.sampling.impl;

import experimentOntology.planning.sampling.PopulationDescription;
import experimentOntology.planning.sampling.ProbabilityTechinique;
import experimentOntology.planning.sampling.SamplingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probability Techinique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.sampling.impl.ProbabilityTechiniqueImpl#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProbabilityTechiniqueImpl extends SamplingStrategyImpl implements ProbabilityTechinique {
	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected PopulationDescription population;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilityTechiniqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SamplingPackage.Literals.PROBABILITY_TECHINIQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationDescription getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPopulation(PopulationDescription newPopulation, NotificationChain msgs) {
		PopulationDescription oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamplingPackage.PROBABILITY_TECHINIQUE__POPULATION, oldPopulation, newPopulation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation(PopulationDescription newPopulation) {
		if (newPopulation != population) {
			NotificationChain msgs = null;
			if (population != null)
				msgs = ((InternalEObject)population).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamplingPackage.PROBABILITY_TECHINIQUE__POPULATION, null, msgs);
			if (newPopulation != null)
				msgs = ((InternalEObject)newPopulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamplingPackage.PROBABILITY_TECHINIQUE__POPULATION, null, msgs);
			msgs = basicSetPopulation(newPopulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SamplingPackage.PROBABILITY_TECHINIQUE__POPULATION, newPopulation, newPopulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SamplingPackage.PROBABILITY_TECHINIQUE__POPULATION:
				return basicSetPopulation(null, msgs);
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
			case SamplingPackage.PROBABILITY_TECHINIQUE__POPULATION:
				return getPopulation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SamplingPackage.PROBABILITY_TECHINIQUE__POPULATION:
				setPopulation((PopulationDescription)newValue);
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
			case SamplingPackage.PROBABILITY_TECHINIQUE__POPULATION:
				setPopulation((PopulationDescription)null);
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
			case SamplingPackage.PROBABILITY_TECHINIQUE__POPULATION:
				return population != null;
		}
		return super.eIsSet(featureID);
	}

} //ProbabilityTechiniqueImpl
