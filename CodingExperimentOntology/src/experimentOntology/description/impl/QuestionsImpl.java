/**
 */
package experimentOntology.description.impl;

import experimentOntology.description.DescriptionPackage;
import experimentOntology.description.Questions;
import experimentOntology.description.SimpleResearchQuestion;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.impl.QuestionsImpl#getResearchQuestions <em>Research Questions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionsImpl extends MinimalEObjectImpl.Container implements Questions {
	/**
	 * The cached value of the '{@link #getResearchQuestions() <em>Research Questions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResearchQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleResearchQuestion> researchQuestions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.QUESTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleResearchQuestion> getResearchQuestions() {
		if (researchQuestions == null) {
			researchQuestions = new EObjectContainmentEList<SimpleResearchQuestion>(SimpleResearchQuestion.class, this, DescriptionPackage.QUESTIONS__RESEARCH_QUESTIONS);
		}
		return researchQuestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DescriptionPackage.QUESTIONS__RESEARCH_QUESTIONS:
				return ((InternalEList<?>)getResearchQuestions()).basicRemove(otherEnd, msgs);
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
			case DescriptionPackage.QUESTIONS__RESEARCH_QUESTIONS:
				return getResearchQuestions();
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
			case DescriptionPackage.QUESTIONS__RESEARCH_QUESTIONS:
				getResearchQuestions().clear();
				getResearchQuestions().addAll((Collection<? extends SimpleResearchQuestion>)newValue);
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
			case DescriptionPackage.QUESTIONS__RESEARCH_QUESTIONS:
				getResearchQuestions().clear();
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
			case DescriptionPackage.QUESTIONS__RESEARCH_QUESTIONS:
				return researchQuestions != null && !researchQuestions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionsImpl
